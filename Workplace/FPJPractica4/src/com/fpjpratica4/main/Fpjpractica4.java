package com.fpjpratica4.main;

public class Fpjpractica4 {

	public static void main(String[] args) {
		Alumno Juan=new Alumno();
		Alumno Pedro=new Alumno();
		Alumno Angel=new Alumno();
		
		Juan.setNombreAlumno("Juan");
		Pedro.setNombreAlumno("Pedro");
		Angel.setNombreAlumno("Angel");
		
		//Juan
		System.out.println("Nombre de alumno: "+Juan.getNombreAlumno());
		System.out.println("Escuela: "+Juan.escuela);
		
		//Pedro
		System.out.println("Nombre de alumno: "+Pedro.getNombreAlumno());
		System.out.println("Escuela: "+Pedro.escuela);
		Pedro.escuela="CUCEI";		
		
		//Angel
		System.out.println("Nombre de alumno: "+Angel.getNombreAlumno());
		System.out.println("Escuela: "+Angel.escuela);
		
		System.out.println("El area de 2 es: "+Alumno.calcularAreaCuadrado(2));
	}

}
