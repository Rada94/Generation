package com.mvcpractica10.pstatements.controller;

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

@WebServlet("/transactionServlet")
public class transactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties props=new Properties();
		String filename="config.properties";
		InputStream inputSteam=getClass().getClassLoader().getResourceAsStream(filename);
		
		if(inputSteam!=null)
		{
			props.load(inputSteam);
		}
		else
		{
			throw new FileNotFoundException("Property file "+filename+" no se encontró en la classpath");
		}
		
		String url=props.getProperty("urlServidor");
		String user=props.getProperty("user");
		String password=props.getProperty("password");
		String driver=props.getProperty("driver");
		String aProductos1=props.getProperty("altaProductos1");
		String aProductos2=props.getProperty("altaProductos2");
		String aProductos3=props.getProperty("altaProductos3");
		String aProductos4=props.getProperty("altaProductos4");
		String aProductos5=props.getProperty("altaProductos5");
		String aProductos6=props.getProperty("altaProductos6");

		Connection conn=null;
		PreparedStatement pstmnt=null;
		
		try
		{
			Class.forName(driver).getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			
			pstmnt=conn.prepareStatement(aProductos1);
			pstmnt.setString(1, "Cremita");
			pstmnt.setDouble(2, 3.0);
			pstmnt.setInt(3, 30);
			pstmnt.executeUpdate();
			pstmnt.close();
			response.getWriter().append("Producto 1: Listo...</br>");
			
			pstmnt=conn.prepareStatement(aProductos2);
			pstmnt.setString(1, "Lechita");
			pstmnt.setDouble(2, 3.0);
			pstmnt.setInt(3, 30);
			pstmnt.executeUpdate();
			pstmnt.close();
			response.getWriter().append("Producto 2: Listo...</br>");
			
			pstmnt=conn.prepareStatement(aProductos3);
			pstmnt.setString(1, "Camaron");
			pstmnt.setDouble(2, 3.0);
			pstmnt.setInt(3, 30);
			pstmnt.executeUpdate();
			pstmnt.close();
			response.getWriter().append("Producto 3: Listo...</br>");

			
			pstmnt=conn.prepareStatement(aProductos4);
			pstmnt.setString(1, "Camote");
			pstmnt.setDouble(2, 7.0);
			pstmnt.setInt(3, 20);
			pstmnt.executeUpdate();
			pstmnt.close();
			response.getWriter().append("Producto 4: Listo...</br>");

			
			pstmnt=conn.prepareStatement(aProductos5);
			pstmnt.setString(1, "Cerveza");
			pstmnt.setDouble(2, 20.0);
			pstmnt.setInt(3, 50);
			pstmnt.executeUpdate();
			pstmnt.close();
			response.getWriter().append("Producto 5: Listo...</br>");

			
			pstmnt=conn.prepareStatement(aProductos6);
			pstmnt.setString(1, "Platanos");
			pstmnt.setDouble(2, 3.0);
			pstmnt.setInt(3, 30);
			pstmnt.executeUpdate();
			conn.commit();
			response.getWriter().append("Producto 6: Listo...</br>");

		}
		catch(Exception e)
		{
			e.getStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				e1.getStackTrace();
			}
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
				ex.getStackTrace();
			}
		}
	}

}
