package com.practica1ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1ajax.model.DatosPersonales;

@WebServlet("/Practica2Servlet")
@MultipartConfig
public class Practica2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DatosPersonales datosPersonales=new DatosPersonales();
		
		datosPersonales.setNombre(request.getParameter("txtNombre"));
		response.setContentType("application/json");
		response.getWriter().append("{"+"\"nombre\":\""+datosPersonales.getNombre()+"\"}");
	}

}
