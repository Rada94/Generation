package com.mvcpractica10.productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida= response.getWriter();
		
		int idProducto=Integer.parseInt(request.getParameter("txtIdProducto"));
		
		//Declaramos e inicializamos las credenciales de acceso
		String url="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario="root";
		String password="root";
		
		//Declaramos e inicializamos los objetos de conexión
		
		Connection conn=null;
		Statement stmnt=null;
		ResultSet rs=null;
		
		double precioProducto=Double.parseDouble(request.getParameter("txtPrecioProducto"));
		
		try 
		{
			//Se instancia el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//Se abre la conexión a la base de datos
			conn=DriverManager.getConnection(url, usuario, password);
			//Apunta el objecto statement que nos sirve para ejecutar comandos en la base de datos(Se crea la consola de comandos que apunta a esa conexión
			stmnt=conn.createStatement();
			
			rs=stmnt.executeQuery("SELECT * FROM productos;");
			while(rs.next())
			{
				if(idProducto==rs.getInt("id_producto"))
				{
					rs=stmnt.executeQuery("UPDATE productos  SET precio_producto='");
					
					salida.append("id_producto:"+rs.getInt("id_producto"));
					salida.append("</br>");
					salida.append("nombreProducto:"+rs.getString("nombre_producto"));
					salida.append("</br>");
					salida.append("precioProducto:"+rs.getDouble("precio_producto"));
					salida.append("</br>");
					salida.append("existenciaProducto:"+rs.getInt("existenciaProducto"));
					salida.append("</br>");
					salida.append("</br>");
					
				}
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
				rs.close();
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
