package com.mvcpractica3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Inicialización de variable
		int numero1=0;
		int numero2=0;
		int suma=0;
		
		//Pasar datos del front-end al back-end
		numero1=Integer.parseInt(request.getParameter("txtNumero1"));
		numero2=Integer.parseInt(request.getParameter("txtNumero2"));
		
		//Operación de datos
		suma=numero1+numero2;
		
		//Respuesta del back-end
		response.getWriter().append("La suma de los números es: "+suma);
	}

}
