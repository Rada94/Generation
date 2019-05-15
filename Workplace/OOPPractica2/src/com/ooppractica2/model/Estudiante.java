package com.ooppractica2.model;

public class Estudiante extends Persona{
	private String materia;
	
	//Metodos contructores
	Estudiante()
	{
		
	}
	
	Estudiante(String nombre, String id,String rol, String materia)
	{
		super(nombre,id,rol);
		this.materia=materia;
	}
	
	Estudiante(String materia)
	{
		this.materia=materia;
	}
	
	//Getters y Setters
	public String getMateria()
	{
		return materia;
	}
	public void setPlaca(String materia)
	{
		this.materia=materia;
	}
	
	public String toString()
	{
		return("Nombre: "+super.getNombre()+"\nID: "+super.getId()+"\nRol:"+super.getRol()+"\nMateria: "+materia+"\n");
	}

	@Override
	public void registroEntrada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registroSalida() {
		// TODO Auto-generated method stub
		
	}
}
