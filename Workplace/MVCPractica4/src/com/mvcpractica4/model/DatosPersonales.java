package com.mvcpractica4.model;

public class DatosPersonales {
	private String nombre;
	private String apellidoPadre;
	private String apellidoMadre;
	private String sexo;
	private String[] mascotas;
	private int edad;
	private double estatura; 
	
	public DatosPersonales()
	{
		
	}
	
	public DatosPersonales(String nombre, String apellidoPadre, String apellidoMadre, String sexo, String[] mascotas, int edad, double estatura)
	{
		this.nombre=nombre;
		this.apellidoPadre=apellidoPadre;
		this.apellidoMadre=apellidoMadre;
		this.sexo=sexo;
		for(int i=0; i<mascotas.length; i++)
		{
			this.mascotas[i]=mascotas[i];
		}
		this.edad=edad;
		this.estatura=estatura;
	}
	
	//Nombre
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	//ApellidoPadre
	public String getApellidoPadre()
	{
		return apellidoPadre;
	}
	public void setApellidoPadre(String apellidoPadre)
	{
		this.apellidoPadre=apellidoPadre;
	}
	
	//apellidoMadre
	public String getApellidoMadre()
	{
		return apellidoMadre;
	}
	public void setApellidoMadre(String apellidoMadre)
	{
		this.apellidoMadre=apellidoMadre;
	}
	
	//Sexo
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	
	//Mascotas
	public String getMascotas()
	{
		String lasMascotas="";
		for(String mascota:mascotas)
		{
			lasMascotas+=(mascota+"\n");
		}
		return lasMascotas;
	}
	public void setMascotas(String[] mascotas)
	{
		this.mascotas=mascotas;
	}
	
	//Edad
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
	//Estatura
	public double getEstatura()
	{
		return estatura;
	}
	public void setEstatura(double estatura)
	{
		this.estatura=estatura;
	}
	
	//toString
	public String toString()
	{
		String lasMascotas="";
		for(String mascota:mascotas)
		{
			lasMascotas+=("-"+mascota+"\n");
		}
		return "Nombre: "+nombre+"\nApellido Padre: "+apellidoPadre+"\nApellido Madre: "+apellidoMadre+"\nEdad: "+edad+"\nEstatura: "+estatura+"\nSexo: "+sexo+"\nMascotas:\n"+lasMascotas;
	}
}
