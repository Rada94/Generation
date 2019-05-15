package com.fpjpratica4.main;

public class Alumno {
	
	//Atributos
	public static String escuela="Tec Mario Molina";
	private String nombreAlumno;
	
	Alumno()
	{
		
	}
	
	//Getter y Setter
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno=nombreAlumno;
	}
	
	public static int calcularAreaCuadrado(int lado)
	{
		return lado+lado;
	}

}
