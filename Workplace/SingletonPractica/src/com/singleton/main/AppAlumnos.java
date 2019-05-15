package com.singleton.main;

import com.singleton.model.Alumnos;

public class AppAlumnos {
	public static void main(String [] args) {
		Alumnos alumno1=Alumnos.getInstanceofAlumnos();
		alumno1.setIdAlumno("1");
		alumno1.setNombreAlumno("Rodrigo");
		System.out.println("ID: "+alumno1.getIdAlumno());
		System.out.println("Nombre: "+alumno1.getNombreAlumno());
		
		Alumnos alumno2=Alumnos.getInstanceofAlumnos();
		alumno2.setIdAlumno("2");
		alumno2.setNombreAlumno("Rada");
		System.out.println("ID: "+alumno1.getIdAlumno());
		System.out.println("Nombre: "+alumno1.getNombreAlumno());
		
		//Alumnos alumno1=Alumnos.getInstanceofAlumnos();
		//Alumnos alumno2=new Alumnos();
	}
}
