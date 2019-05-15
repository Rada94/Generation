package com.mvcpractica7.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumaServlet")
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numero1=Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2=Integer.parseInt(request.getParameter("txtNumero2"));
		int suma=numero1+numero2;
		int resta=numero1-numero2;
		int multiplicacion=numero1*numero2;
		
		request.setAttribute("suma", suma);
		request.setAttribute("resta", resta);
		request.setAttribute("multiplicacion", multiplicacion);
		
		if(suma==0)
		{
			RequestDispatcher rs=request.getRequestDispatcher("cero.jsp");
			rs.forward(request, response);
		}
		else
		{
			if(suma==37)
			{
				RequestDispatcher rs=request.getRequestDispatcher("macho.jsp");
				rs.forward(request, response);
			}
			else
			{
				if(suma>0)
				{
					RequestDispatcher rs=request.getRequestDispatcher("PositivoServlet");
					rs.forward(request, response);
				}
				else
				{
					RequestDispatcher rs=request.getRequestDispatcher("NegativoServlet");
					rs.forward(request, response);
				}
			}
		}
	}

}
