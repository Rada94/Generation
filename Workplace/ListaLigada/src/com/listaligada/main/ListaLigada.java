package com.listaligada.main;

public class ListaLigada {
	private Nodo head;
	
	public ListaLigada()
	{
		head=null;
	}
	
	public void add(Object value)
	{		
		if(this.head==null)
		{
			this.head=new Nodo(value);
		}
		else
		{
			Nodo nodoActual= this.head;
			while(nodoActual.getNext() !=null)
			{
				nodoActual=nodoActual.getNext();
			}
			nodoActual.setNext(new Nodo(value));
		}
	}
	
	public String imprimir()
	{
		while()
		{
			
		}
	}
}
