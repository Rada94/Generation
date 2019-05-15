package com.ooppractica2.model;

public abstract class Persona implements Personable{
	private String nombre;
	private String id;
	private String rol;
	
	//Metodos constructores
	public Persona()
	{
		
	}
	
	public Persona(String nombre, String id, String rol)
	{
		this.nombre=nombre;
		this.id=id;
		this.rol=rol;
	}
	
	//Getters y Setters
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public void setRol(String rol)
	{
		this.rol=rol;
	}
	public String getRol()
	{
		return rol;
	}
	
	//Metodo
	public String toString()
	{
		return("Nombre: "+nombre+"\nID: "+id+"\nRol: "+rol+"\n");
	}
}
