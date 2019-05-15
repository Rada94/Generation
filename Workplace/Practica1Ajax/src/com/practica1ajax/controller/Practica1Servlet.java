package com.practica1ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practica1Servlet")
public class Practica1Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nombre=request.getParameter("txtNombre");
		response.setContentType("application/json");
		response.getWriter().append("{"+"\"nombre\":\""+nombre+"\"}");
	}

}
