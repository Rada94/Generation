package com.login.model;

public class UsuarioRegistrado
{
	private String usuario="";
	private String contrasenia="";
	
	public UsuarioRegistrado()
	{
		
	}
	
	public UsuarioRegistrado(String usuario, String contrasenia)
	{
		this.usuario=usuario;
		this.contrasenia=contrasenia;
	}
	
	public String getUsuario()
	{
		return usuario;
	}
	
	public void setUsuario(String usuario)
	{
		this.usuario=usuario;
	}
	
	public String getContrasenia()
	{
		return contrasenia;
	}
	
	public void setContrasenia(String contraseñia)
	{
		this.contrasenia=contraseñia;
	}
}
