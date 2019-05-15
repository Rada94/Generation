package com.ooppractica2.model;

import java.util.Date;

public class Guardia extends Persona{
	private String puesto;
	private Date horario;
	private double salario;
	
	//Métodos constructores
	public Guardia()
	{
		
	}
	
	public Guardia(String puesto, Date horario, double salario)
	{
		this.puesto=puesto;
		this.horario=horario;
		this.salario=salario;
	}
	
	public Guardia(String nombre, String id, String rol, String puesto, Date horario, double salario)
	{
		super(nombre,id,rol);
		this.puesto=puesto;
		this.horario=horario;
		this.salario=salario;
	}
	
	//Getters y Setters
	public void setPuesto(String puesto)
	{
		this.puesto=puesto;
	}
	public String getPuesto()
	{
		return puesto;
	}
	public void setHorario(Date horario)
	{
		this.horario=horario;
	}
	public Date getHorario()
	{
		return horario;
	}
	public void setSalario(double salario)
	{
		this.salario=salario;
	}
	public double getSalario()
	{
		return salario;
	}
	
	@Override
	public String toString()
	{
		return("Nombre: "+super.getNombre()+"\nID: "+super.getId()+"\nRol:"+super.getRol()+"\nPuesto: "+puesto+"\nHorario: "+horario+"\nSalario: "+salario+"\n");
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
