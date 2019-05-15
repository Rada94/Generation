package com.practica1ajax.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.practica1ajax.model.DatosPersonales;

@WebServlet("/Practica3Servlet")
public class Practica3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DatosPersonales datos=new DatosPersonales();
		datos.setNombre(request.getParameter("txtNombre"));
		datos.setApellidoP(request.getParameter("txtApellidoP"));
		datos.setApellidoM(request.getParameter("txtApellidoM"));
		datos.setDomicilio(request.getParameter("txtDomicilio"));
		datos.setTelefono(request.getParameter("txtTelefono"));
		datos.setCorreo(request.getParameter("txtCorreo"));
		datos.setRfc(request.getParameter("txtRFC"));
		datos.setEstatura(Double.parseDouble(request.getParameter("txtEstatura")));
		
		Properties props=new Properties();
		String fileProperty="config.properties";
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(fileProperty);
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		int nRegistros=0;
		
		if(inputStream!=null)
		{
			props.load(inputStream);
		}
		else
		{
			throw new FileNotFoundException("Property file "+fileProperty+" is not found in the classpath");
		}
		
		String url=props.getProperty("url");
		String user=props.getProperty("user");
		String pass=props.getProperty("pass");
		String driver=props.getProperty("driver");
		String sqlSequence=props.getProperty("insertEmpleado");
		
		try 
		{
			Class.forName(driver).getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, user, pass);
			pstmnt=conn.prepareStatement(sqlSequence);
			pstmnt.setString(1, datos.getNombre());
			pstmnt.setString(2, datos.getApellidoP());
			pstmnt.setString(3, datos.getApellidoM());
			pstmnt.setString(4, datos.getDomicilio());
			pstmnt.setString(5, datos.getTelefono());
			pstmnt.setString(6, datos.getCorreo());
			pstmnt.setString(7, datos.getTelefono());
			pstmnt.setDouble(8, datos.getEstatura());
			nRegistros=pstmnt.executeUpdate();
			
			if(nRegistros>0)
			{
				response.getWriter().append("Se creo");
			}
			else
			{
				response.getWriter().append("No se creo");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmnt.close();
				conn.close();
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
		response.setContentType("application/json");
		Gson objGson=new Gson();
		String miJson;
		miJson=objGson.toJson(datos);
		response.getWriter().append(miJson);
		
		
//		response.getWriter().append("Nombre: "+datos.getNombre());
//		response.getWriter().append("Apellido Paterno: "+datos.getApellidoP());
//		response.getWriter().append("Apellido Materno: "+datos.getApellidoM());
//		response.getWriter().append("Domicilio: "+datos.getDomicilio());
//		response.getWriter().append("Correo: "+datos.getCorreo());
//		response.getWriter().append("Telefono: "+datos.getTelefono());
//		response.getWriter().append("RFC: "+datos.getRfc());
	}

}
