package com.ooppractica1.model;

public class Alumno 
{
	//Propiedades, atributos, caracteristicas
	private String nombreAlumno;
	private String direccionAlumno;
	
	//Metodos, acciones, comportamientos
	//Contructores
	public Alumno() {}
	
	public Alumno(String nombreAlumno)
	{
		this.nombreAlumno=nombreAlumno;
	}
		
	public Alumno(String nombreAlumno, String direccionAlumno)
	{
		this.nombreAlumno=nombreAlumno;
		this.direccionAlumno=direccionAlumno;
	}
	
	//Getters y Setters
	//Getters con metodos de lectura
	//Setters son metodos de escritura
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno=nombreAlumno;
	}
	
	
	public String getDireccionAlumno()
	{
		return direccionAlumno;
	}
	public void setDireccionAlumno(String direccionAlumno)
	{
		this.direccionAlumno=direccionAlumno;
	}
}
