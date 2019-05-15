package com.ejercicios1.main;

import java.util.Scanner;
import java.util.Random;

public class Ejercicios {

	public static void main(String[] args) {
		
		//Factorial
		int numeroUsuario;
		long resultado=1;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingrese un número entero: ");
		numeroUsuario=entrada.nextInt();
		for(int i=2; i<=numeroUsuario; i++)
		{
			resultado*=i;
		}
		System.out.println("El factorial es: "+resultado+"\n");
		
		//Burbuja
		final int LIMITE_ARREGLO=30;
		final int LIMITE_SUPERIOR=50;
		int temp;
		int[] numerosEnteros=new int[LIMITE_ARREGLO];
		System.out.println("Burbuja");
		Random rnd=new Random(System.currentTimeMillis());
		for(int i=0; i<LIMITE_ARREGLO; i++)
		{
			numerosEnteros[i]=rnd.nextInt(LIMITE_SUPERIOR);
		}
		for(int i=0; i<LIMITE_ARREGLO-1; i++)
		{
			if(numerosEnteros[i]>numerosEnteros[i+1])
			{
				temp=numerosEnteros[i];
				numerosEnteros[i]=numerosEnteros[i+1];
				numerosEnteros[i+1]=temp;
				i=-1;
			}
		}
		for(int i=0; i<LIMITE_ARREGLO; i++)
		{
			System.out.print(numerosEnteros[i]+" ");
		}
		
		//Sumatoria
		resultado=0;
		System.out.print("\n\nIngrese un número entero: ");
		numeroUsuario=entrada.nextInt();
		for(int i=1; i<=numeroUsuario; i++)
		{
			resultado+=i;
		}
		System.out.println("La sumatoria es: "+resultado+"\n");
		
		//Numeros duplicados
		int contDuplicados=0;
		int limiteArreglo=LIMITE_ARREGLO;
		
		System.out.println("Duplicados...");
		for(int i=0; i<LIMITE_ARREGLO; i++)
		{
			numerosEnteros[i]=rnd.nextInt(LIMITE_SUPERIOR);
			System.out.print(numerosEnteros[i]+" ");
		}
		for(int i=0; i<limiteArreglo; i++)
		{
			temp=numerosEnteros[i];
			for(int j=0; j<limiteArreglo; j++)
			{
				if(temp==numerosEnteros[j] || contDuplicados<2)
				{
					
				}
				else
				{
					
				}
			}
		}
		System.out.println("\nSin duplicados...");
		for(int i=0; i<limiteArreglo; i++)
		{
			System.out.print(numerosEnteros[i]+" ");
		}
		
		entrada.close();
	}
	
}
