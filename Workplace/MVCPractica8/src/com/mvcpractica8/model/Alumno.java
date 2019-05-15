package com.mvcpractica8.model;

public class Alumno {
	//Atributos
	private String nombre;
	private double calif1;
	private double calif2;
	
	//Constructores
	public Alumno()
	{
		
	}
	
	public Alumno(String nombre, double calif1, double calif2)
	{
		this.nombre=nombre;
		this.calif1=calif1;
		this.calif2=calif2;
	}
	
	//Getters y Setters
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public double getCalif1()
	{
		return calif1;
	}
	
	public void setCalif1(double calif1)
	{
		this.calif1=calif1;
	}
	
	public double getCalif2()
	{
		return calif2;
	}
	
	public void setCalif2(double calif2)
	{
		this.calif2=calif2;
	}
	

}
