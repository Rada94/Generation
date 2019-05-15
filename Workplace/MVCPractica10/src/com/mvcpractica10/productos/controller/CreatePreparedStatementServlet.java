package com.mvcpractica10.productos.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica10.productos.model.Productos;

@WebServlet("/CreatePreparedStatementServlet")
public class CreatePreparedStatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Declarar variables
		String urlServidor="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
		String usuario="root";
		String password="root";
		String sql="INSERT INTO productos(nombre_producto, precio_producto, existenciaProducto) VALUES (?,?,?)";
		
		Productos miProducto=new Productos();
		miProducto.setNombre(request.getParameter("txtNombreProducto"));
		miProducto.setPrecio(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		miProducto.setExistencia(Integer.parseInt(request.getParameter("txtExistenciaProducto")));
		
		//Declarar objetos
		Connection conn=null;
		PreparedStatement pstmnt=null;
		int nRegistros=0;
		
		//Insertar Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(urlServidor, usuario, password);
			pstmnt=conn.prepareStatement(sql);
			pstmnt.setString(1, miProducto.getNombre());
			pstmnt.setDouble(2, miProducto.getPrecio());
			pstmnt.setInt(3, miProducto.getExistencia());
			
			nRegistros=pstmnt.executeUpdate();
			if(nRegistros>0)
			{
				response.getWriter().append("Registro SI se añadio</br>");
			}
			else
			{
				response.getWriter().append("Registro NO se añadio</br>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			response.getWriter().append("<a href='createPreparedStatement.jsp'>Regresar</a>");
			try {
				pstmnt.close();
				conn.close();
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
		}
		
		//Conectar BD
		
		//Ejecutar Query
		
		//Cerrar conexion
	}

}
