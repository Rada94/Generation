package com.practica1ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.practica1ajax.model.DatosPersonales;

@WebServlet("/Practica4Servlet")
public class Practica4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String json=request.getParameter("txtJSON");
		DatosPersonales datosPersonales=new DatosPersonales();
		Gson gson=new Gson();
		datosPersonales=gson.fromJson(json, datosPersonales.getClass());
		
		PrintWriter salida= response.getWriter();
		
		salida.append("Nombre: "+datosPersonales.getNombre()+"</br>");
		salida.append("Apellido Paterno: "+datosPersonales.getApellidoP()+"</br>");
		salida.append("Apellido Materno: "+datosPersonales.getApellidoM()+"</br>");
		salida.append("Domicilio: "+datosPersonales.getDomicilio()+"</br>");
		salida.append("Correo: "+datosPersonales.getCorreo()+"</br>");
		salida.append("Telefono: "+datosPersonales.getTelefono()+"</br>");
		salida.append("RFC: "+datosPersonales.getRfc()+"</br>");
		salida.append("Estatura: "+datosPersonales.getEstatura()+"</br>");
		
	}

}
