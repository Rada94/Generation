package com.mvcpractica4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvcpractica4.model.DatosPersonales;

@WebServlet("/DatosPersonales")
public class DatosPersonalesServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		final int CANTIDAD_DE_REGISTROS=100;
//		String nombre="";
//		String apellidoP="";
//		String apellidoM="";
//		String sexo="";
//		String[] mascotas;
//		int edad=0;
//		double estatura=0.0;
		
//		nombre=request.getParameter("txtNombre");
//		apellidoP=request.getParameter("txtApellidoP");
//		apellidoM=request.getParameter("txtApellidoM");
//		edad=Integer.parseInt(request.getParameter("txtEdad"));
//		estatura=Double.parseDouble(request.getParameter("txtEstatura"));
//		sexo=request.getParameter("rdSexo");
//		mascotas=request.getParameterValues("cbMascotas");
		
//		response.getWriter().append("Nombre: "+nombre+"\n");
//		response.getWriter().append("Apellido Paterno: "+apellidoP+"\n");
//		response.getWriter().append("Apellido Materno: "+apellidoM+"\n");
//		response.getWriter().append("Edad: "+edad+"\n");
//		response.getWriter().append("Estatura: "+estatura+"\n");
//		response.getWriter().append("Sexo: "+sexo+"\n");
//		response.getWriter().append("Mascotas:\n");
//		for(String porMascota:mascotas)
//		{
//			response.getWriter().append("-"+porMascota+"\n");
//		}
		
//		DatosPersonales Pau=new DatosPersonales();
//		DatosPersonales Mike=new DatosPersonales();
//		DatosPersonales Monche=new DatosPersonales();
		ArrayList<DatosPersonales> registros=new ArrayList<DatosPersonales>();
		
//		Pau.setNombre(nombre);
//		Pau.setApellidoPadre(apellidoP);
//		Pau.setApellidoMadre(apellidoM);
//		Pau.setEdad(edad);
//		Pau.setEstatura(estatura);
//		Pau.setSexo(sexo);
//		Pau.setMascotas(mascotas);
//		
//		Mike.setNombre(nombre);
//		Mike.setApellidoPadre(apellidoP);
//		Mike.setApellidoMadre(apellidoM);
//		Mike.setEdad(edad);
//		Mike.setEstatura(estatura);
//		Mike.setSexo(sexo);
//		Mike.setMascotas(mascotas);
		
//		Monche.setNombre(request.getParameter("txtNombre"));
//		Monche.setApellidoPadre(request.getParameter("txtApellidoP"));
//		Monche.setApellidoMadre(request.getParameter("txtApellidoM"));
//		Monche.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
//		Monche.setEstatura(Double.parseDouble(request.getParameter("txtEstatura")));
//		Monche.setSexo(request.getParameter("rdSexo"));
//		Monche.setMascotas(request.getParameterValues("cbMascotas"));
		
		
		for(int i=0; i<CANTIDAD_DE_REGISTROS; i++)
		{
			registros.add(new DatosPersonales("registro"+i,"registro"+i,"registro"+i,"registro"+i,null,i,i));
		}
		
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html charset=UTF-8");
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Datos Personales");
		salida.append("</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>");
		salida.append("Datos personales");
		salida.append("</h2>");
		salida.append("<table>");
		salida.append("<thead>");
		salida.append("<tr>");
		salida.append("<th>Nombre</th>");
		salida.append("<th>Apellido Paterno</th>");
		salida.append("<th>Apellido Materno</th>");
		salida.append("<th>Edad</th>");
		salida.append("<th>Estatura</th>");
		salida.append("<th>Sexo</th>");
		salida.append("<th>Mascotas</th>");
		salida.append("</tr>");
		salida.append("</thead>");
		salida.append("<tr>");
		for(DatosPersonales person:registros)
		{
			salida.append("<td>"+person.getNombre()+"</td>");
			salida.append("<td>"+person.getApellidoPadre()+"</td>");
			salida.append("<td>"+person.getApellidoMadre()+"</td>");
			salida.append("<td>"+person.getEdad()+"</td>");
			salida.append("<td>"+person.getEstatura()+"</td>");
			salida.append("<td>"+person.getSexo()+"</td>");
			salida.append("<td>"+person.getMascotas()+"</td>");
		}
//		salida.append("<td>"+Monche.getNombre()+"</td>");
//		salida.append("<td>"+Monche.getApellidoPadre()+"</td>");
//		salida.append("<td>"+Monche.getApellidoMadre()+"</td>");
//		salida.append("<td>"+Monche.getEdad()+"</td>");
//		salida.append("<td>"+Monche.getEstatura()+"</td>");
//		salida.append("<td>"+Monche.getSexo()+"</td>");
//		salida.append("<td>"+Monche.getMascotas()+"</td>");
		salida.append("</tr>");
		salida.append("</table>");
		salida.append("</body>");
		salida.append("<footer>");
		salida.append("</footer>");
		salida.append("</html>");
		
		salida.close();
		
		
	}

}
