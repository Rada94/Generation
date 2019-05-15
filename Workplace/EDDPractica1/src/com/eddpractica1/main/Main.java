package com.eddpractica1.main;

import java.util.ArrayList;
import java.util.Stack;

public class Main 
{
	public static void main(String[] args) 
	{
		String frase="anita lava la tina";
		ArrayList<Character> nuevaFrase=new ArrayList<Character>();
		Stack<Character> pila=new Stack<Character>();
		boolean palindromo=true;
		
		frase.replace(" ", "");
		
		for(int i=0; i<frase.length(); i++)
		{
			pila.add(frase.charAt(i));
			nuevaFrase.add(frase.charAt(i));
		}
		for(int i=0; i<frase.length();i++)
		{
			if(pila.get(i)!=nuevaFrase.get(i))
			{
				palindromo=false;
				break;
			}
		}
		
		System.out.println("La frase es un palindromo? "+palindromo);
	}
}
