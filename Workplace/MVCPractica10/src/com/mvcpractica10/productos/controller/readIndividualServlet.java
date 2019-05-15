package com.mvcpractica10.productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readIndividualServlet")
public class readIndividualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida= response.getWriter();
		
		//Declaramos e inicializamos las credenciales de acceso
		String url="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario="root";
		String password="root";
		String sql="SELECT * FROM productos WHERE id_producto";
		
		//Declaramos e inicializamos los objetos de conexión
		
		Connection conn=null;
		Statement stmnt=null;
		ResultSet rs=null;
		
		int comp=0;
		int idProducto=0;
		String nombreProducto="";
		double precioProducto=0.0;
		int existenciaProducto=0;
		
		try 
		{
			//Se instancia el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//Se abre la conexión a la base de datos
			conn=DriverManager.getConnection(url, usuario, password);
			//Apunta el objecto statement que nos sirve para ejecutar comandos en la base de datos(Se crea la consola de comandos que apunta a esa conexión
			stmnt=conn.createStatement();
			rs=stmnt.executeQuery(sql);
			rs.next();
			
			comp=rs.getInt("id_producto");
			
			while(rs.next())
			{
				if(comp==rs.getInt("id_producto"))
				{
					idProducto=rs.getInt("id_producto");
					nombreProducto=rs.getString("nombre_producto");
					precioProducto=rs.getDouble("precio_producto");
					existenciaProducto=rs.getInt("existenciaProducto");
					
					RequestDispatcher rd=request.getRequestDispatcher("readIndividual.jsp");
					response.sendRedirect("readInvididual.jsp");
					salida.print("<p>ID Producto: "+idProducto+"</p>");
					salida.print("<p>Nombre del producto: "+nombreProducto+"</p>");
					salida.print("<p>Precio del producto: "+precioProducto+"</p>");
					salida.print("<p>Existencias: "+existenciaProducto+"</p>");
					
					rd.include(request, response);
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
			} catch (SQLException ex) 
			{
				ex.printStackTrace();
			}
		}
		salida.close();
	}

}
