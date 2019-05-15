package com.pruebas.controller;

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

import com.pruebas.model.Personas;

@WebServlet("/CreatePersonaServlet")
public class CreatePersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Personas persona=new Personas();
		persona.setNombre(request.getParameter("txtNombre"));
		persona.setApellidoP(request.getParameter("txtApellidoP"));
		persona.setApellidoM(request.getParameter("txtApellidoM"));
		persona.setCorreo(request.getParameter("txtCorreo"));
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		
		Properties props=new Properties();
		String fileProperties="config.properties";
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(fileProperties);
		
		if(inputStream!=null)
		{
			props.load(inputStream);
		}
		else
		{
			throw new FileNotFoundException();
		}
		
		String url=props.getProperty("url");
		String user=props.getProperty("user");
		String pass=props.getProperty("pass");
		String driver=props.getProperty("driver");
		String sql=props.getProperty("insertPersona");
		int nRegistros=0;
		
		try
		{
			Class.forName(driver).getConstructor().newInstance();
			conn=DriverManager.getConnection(url, user, pass);
			pstmnt=conn.prepareStatement(sql);
			pstmnt.setString(1, persona.getNombre());
			pstmnt.setString(2, persona.getApellidoP());
			pstmnt.setString(3, persona.getApellidoM());
			pstmnt.setString(4, persona.getCorreo());
			nRegistros=pstmnt.executeUpdate();
			
			if(nRegistros>0)
			{
				response.getWriter().append("Se creo una nueva persona");
			}
			else
			{
				response.getWriter().append("No se creo una nueva persona");
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
		
	}

}
