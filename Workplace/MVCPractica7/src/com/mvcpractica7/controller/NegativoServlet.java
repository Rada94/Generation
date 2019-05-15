package com.mvcpractica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NegativoServlet")
public class NegativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html charset='UTF-8'");
		
		int resultadoOperacion=(int) request.getAttribute("resultado");
		
		salida.append("El valor de la suma es: "+resultadoOperacion);
		salida.append("Negativo");
		
		salida.close();
	}

}
