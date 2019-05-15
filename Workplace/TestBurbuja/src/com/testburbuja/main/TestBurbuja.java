package com.testburbuja.main;

import java.util.Random;

public class TestBurbuja {

	public static void main(String[] args)
	{
		final int LIMITE_ARREGLO=30;
		final int LIMITE_SUPERIOR=50;
		int contOrdenamiento=0;
		int temp;
		int i;
		int contMayores;
		int numeroDesconocido;
		int inicial;
		int fin;
		int medio;
		int numeroIteraciones=0;
		int[] numerosEnteros=new int[LIMITE_ARREGLO];
		
		System.out.println("Burbuja");
		Random rnd=new Random(System.currentTimeMillis());
		for(i=0; i<LIMITE_ARREGLO; i++)
		{
			numerosEnteros[i]=rnd.nextInt(LIMITE_SUPERIOR);
		}
		do
		{
			contMayores=0;
			for(i=0; i<LIMITE_ARREGLO-1; i++)
			{
				if(numerosEnteros[i]>numerosEnteros[i+1])
				{
					temp=numerosEnteros[i];
					numerosEnteros[i]=numerosEnteros[i+1];
					numerosEnteros[i+1]=temp;
					contMayores++;
				}
				contOrdenamiento++;
			}
		}
		while(contMayores>0);
		for (i=0; i<LIMITE_ARREGLO; i++) 
		{
			System.out.println((i+1)+".- "+numerosEnteros[i]);
		}
		
		numeroDesconocido=numerosEnteros[rnd.nextInt(LIMITE_ARREGLO-1)];
		inicial=0;
		fin=LIMITE_ARREGLO;
		medio=(fin-inicial)/2;
		
		do
		{
			numeroIteraciones++;
			if(numerosEnteros[medio]<numeroDesconocido)
			{
				inicial=medio;
				medio=medio+((fin-inicial)/2);
			}
			else
			{
				if(numerosEnteros[medio]>numeroDesconocido)
				{
					fin=medio;
					medio=(fin-inicial)/2;
				}
				else
				{
					break;
				}
			}
		}
		while(numeroDesconocido!=numerosEnteros[medio]);
		
		System.out.println("\nNumero selecionados: "+numerosEnteros[medio]+" en posicion "+(medio+1));
		System.out.println("Numero desconocido: "+numeroDesconocido);
		System.out.println("Numero de iteraciones por ordenamiento: "+contOrdenamiento);
		System.out.println("Numero de iteraciones por busqueda: "+numeroIteraciones);
	}
}
