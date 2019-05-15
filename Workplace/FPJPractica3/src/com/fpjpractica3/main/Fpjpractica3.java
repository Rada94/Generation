package com.fpjpractica3.main;

import java.util.Random;

public class Fpjpractica3 {

	public static void main(String[] args) {
		//Generar un vector de 100 numeros aleatorios del 0 al 100
		final int ELEMENTOS_VECTOR=100;
		final int LIMITE_SUPERIOR=100;
		
		int[] enteros=new int[ELEMENTOS_VECTOR];
		int temp=0;
		int vueltas=0;
		
		Random aleatorio=new Random(System.currentTimeMillis());
		
		for(int i=0; i<ELEMENTOS_VECTOR; i++)
		{
			enteros[i]=aleatorio.nextInt(LIMITE_SUPERIOR);
		}
		for(int i=0; i<ELEMENTOS_VECTOR-1; i++)
		{
			if(enteros[i]>enteros[i+1])
			{
				temp=enteros[i];
				enteros[i]=enteros[i+1];
				enteros[i+1]=temp;
				i=-1;
				vueltas++;
			}
		}
		for(int i=0; i<ELEMENTOS_VECTOR; i++)
		{
			System.out.println("Entero ["+i+"]: "+enteros[i]);
		}
		System.out.println("Numero de vueltas: "+vueltas);
	}

}
