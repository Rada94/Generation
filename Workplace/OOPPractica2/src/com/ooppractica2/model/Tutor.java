package com.ooppractica2.model;

public class Tutor extends Persona{
	private String ninio;
	private String placa;
	
	//Metodos constructivos
	Tutor()
	{
		
	}
	
	Tutor(String ninio, String placa)
	{
		this.ninio=ninio;
		this.placa=placa;
	}
	
	Tutor(String nombre, String id, String rol, String ninio, String placa)
	{
		super(nombre, id, rol);
		this.ninio=ninio;
		this.placa=placa;
	}
	
	//Getters y Setters
	public String getNinio()
	{
		return ninio;
	}
	public void setNinio(String ninio)
	{
		this.ninio=ninio;
	}
	public String getPlaca()
	{
		return placa;
	}
	public void setPlaca(String placa)
	{
		this.placa=placa;
	}
	
	@Override
	public String toString()
	{
		return("Nombre: "+super.getNombre()+"\nID: "+super.getId()+"\nRol: "+super.getRol()+"\nNiño: "+ninio+"\nPlaca: "+placa+"\n");
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
