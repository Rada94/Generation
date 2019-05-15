package com.ooppractica1.main;

import com.ooppractica1.model.Alumno;

public class AppEscuela 
{
	public static void main(String[] args) 
	{
		//Forma de dos lineas
		Alumno Miguel;
		Miguel = new Alumno();
		
		//Forma de una linea
		Alumno Armando=new Alumno("Armando");
		
		Alumno Carlos=new Alumno("Carlos", "Plaza del Sol");
		
		Miguel.setNombreAlumno("Miguel");
		Miguel.setDireccionAlumno("Ijalti");
		
		System.out.println("El nombre de Miguel es: "+Miguel.getNombreAlumno());
		System.out.println("La dirección de Miguel es: "+Miguel.getDireccionAlumno());

		System.out.println("El nombre de Armando es: "+Armando.getNombreAlumno());
		System.out.println("La dirección de Armando es: "+Armando.getDireccionAlumno());
		
		System.out.println("El nombre de Carlos es: "+Carlos.getNombreAlumno());
		System.out.println("La dirección de Carlos es: "+Carlos.getDireccionAlumno());
		
		Carlos.setNombreAlumno("Tabacholos");
		System.out.println("El nombre del objeto Carlos es: "+Carlos.getNombreAlumno());
		System.out.println("El domicilio de Carlos cambió a: "+Carlos.getDireccionAlumno());
	}
}
