package com.mvcpractica10.crudpsp.comtroller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreatePSPropServlet")
public class CreatePSPropServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result="";
		Properties props=new Properties();
		String nombreArchivo="config.properties";
		InputStream inputStream=getClass();
		
		Producto
	}

}
