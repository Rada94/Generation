package com.mvcpractica9.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estamos en el Servlet");
		String usuario=request.getParameter("txtUsuario");
		String contrasenia=request.getParameter("pwContrasenia");
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		
		if(usuario.contentEquals("admin") && contrasenia.contentEquals("1234"))
		{
			HttpSession objSesion=request.getSession(true);
			objSesion.setAttribute("usuario", usuario);
			objSesion.setAttribute("contrasenia", contrasenia);
			objSesion.setMaxInactiveInterval(30);

			response.sendRedirect("logueado.jsp");
		}
		else
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			
			response.sendRedirect("login.jsp");
			salida.println("<font color:'red' >Credenciales Invalidas</font>");
			dispatcher.include(request, response);
		}
		System.out.println("Salimos de Servlet");
	}
}
