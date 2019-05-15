package com.ooppractica2.main;

import java.util.Date;
import com.ooppractica2.model.Persona;
import com.ooppractica2.model.Guardia;
import com.ooppractica2.model.Tutor;
import com.ooppractica2.model.Estudiante;

public class AppGuarderia {

	public static void main(String[] args) {
		Persona popeye;
		Guardia Jorge=new Guardia("Guardia", null, 10.2);
		popeye=new Guardia("Popeye", "1", "Guardia", "Guardia", null, 2.0);
		
		//System.out.println("Nombre: "+popeye.getNombre()+"\nID: "+popeye.getId()+"\nRol: "+popeye.getRol());
		System.out.println(popeye.toString());
		
		Jorge.setId("2");
		Jorge.setNombre("Yorgi");
		Jorge.setRol("Tutor");
		
		System.out.println(Jorge.toString());
	}

}
