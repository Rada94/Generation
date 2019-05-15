package com.mvcpractica10.productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createServlet")
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida= response.getWriter();
		
		//Declaramos e inicializamos las credenciales de acceso
		String url="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario="root";
		String password="root";
		
		//Declaramos e inicializamos los objetos de conexión
		
		Connection conn=null;
		Statement stmnt=null;
		//ResultSet rs=null;
		int nRegistros=0;
		
		String nombreProducto=request.getParameter("txtNombreProducto");
		double precioProducto=Double.parseDouble(request.getParameter("txtPrecioProducto"));
		int existenciaProducto=Integer.parseInt(request.getParameter("txtExistenciaProducto"));
		
		try 
		{
			//Se instancia el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//Se abre la conexión a la base de datos
			conn=DriverManager.getConnection(url, usuario, password);
			//Apunta el objecto statement que nos sirve para ejecutar comandos en la base de datos(Se crea la consola de comandos que apunta a esa conexión
			stmnt=conn.createStatement();
			
			nRegistros=stmnt.executeUpdate("INSERT INTO productos(nombre_producto, precio_producto, existenciaProducto) VALUES('"+nombreProducto+"','"+precioProducto+"','"+existenciaProducto+"');");
			
			if(nRegistros>0)
			{
				salida.append("Registro fue creado con exito</br> <a href='create.jsp'>Regresar</a>");
			}
			else
			{
				salida.append("No se realizo el registro</br>  <a href='create.jsp'>Regresar</a>");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			//Cerramos las conexiones y colocamos los objetos  a disposición del garbage collector
			try 
			{
				//rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		salida.close();
	}

}
