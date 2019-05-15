package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.autentication.Autentication;
import com.login.model.UsuarioRegistrado;

@WebServlet("/DatosPersonalesServlet")
public class DatosPersonalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean autenticado;
		Autentication auten=new Autentication();
		autenticado=auten.AutenticationUsrs(request.getParameter("txtUsuario"), request.getParameter("txtContrasenia"));
		
		if(autenticado)
		{
			RequestDispatcher dispacher=request.getRequestDispatcher("exitoso.jsp");
			dispacher.forward(request, response);
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("<script type\"text/javascript\">");
			out.println("alert(\"Usuario y/o contraseña no valido, intente de nuevo\")");
			out.println("");
			out.println("</script>");
			
		}
		
		
	}

}
