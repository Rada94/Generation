package com.mvcpractica2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MensajeServlet")
public class MensajeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String miMensaje="";
		miMensaje=request.getParameter("txtMensaje");
		response.getWriter().append("Tu mensaje fue (Método GET): "+miMensaje);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String miMensaje="";
		miMensaje=request.getParameter("txtMensaje");
		response.getWriter().append("Tu mensaje fue (Método POST): "+miMensaje);
	}

}
