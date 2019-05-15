package com.listaligada.main;

public class Principal {

	public static void main(String[] args) 
	{
		ListaLigada lista=new ListaLigada();
		lista.add(2);
		lista.add(5);
		lista.add(8);
		lista.add(90);
		lista.add(40);
		lista.add(23);
		lista.add(1);
		
		String resultado=lista.imprimir();
		System.out.println(resultado);
	}
}
