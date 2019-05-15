package com.login.autentication;

import java.util.ArrayList;

import com.login.model.UsuarioRegistrado;

public class Autentication {
	ArrayList<UsuarioRegistrado> usuarios =new ArrayList<UsuarioRegistrado>();
	UsuarioRegistrado usr1=new UsuarioRegistrado("Rodrigo","1234");
	UsuarioRegistrado usr2=new UsuarioRegistrado("Rada", "5678");
	UsuarioRegistrado usr3=new UsuarioRegistrado("Vaca", "12345");
	
	
	public Autentication() 
	{
		usuarios.add(usr1);
		usuarios.add(usr2);
		usuarios.add(usr3);
	}
	
	public boolean AutenticationUsrs(String usuario, String contrasenia)
	{
		boolean result=false;
		for(UsuarioRegistrado user:usuarios)
		{
			if(user.getUsuario().equals(usuario) && user.getContrasenia().equals(contrasenia))
			{
				result=true;
			}
		}
		return result;
	}
	
}
