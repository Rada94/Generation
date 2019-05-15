package com.mvcpractica10.productos.model;

public class Productos {
	
	private int id=0;
	private String nombre="";
	private double precio=0.0;
	private int existencia=0;
	
	public Productos()
	{
		
	}
	
	public Productos(int id, String nombre, double precio, int existencia)
	{
		this.setId(id);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setExistencia(existencia);
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	public int getExistencia() 
	{
		return existencia;
	}

	public void setExistencia(int existencia) 
	{
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + "]";
	}
	
	
}
