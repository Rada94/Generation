package com.fpjpractica2.main;

import java.util.Scanner;

public class Fpjpractica2 {

	public static void main(String[] args) {
		//Practica 7
		//Ciclo for
		//Series
		//1 al 100
		for(int cont=1; cont<=100; cont++)
		{
			System.out.println(cont);
		}
		
		//Ciclo for
		/*for(int cont=1; cont>0; cont++)
		{
			System.out.println(cont);
		}*/
		
		//Practica 7
		//Calcular numero primo
		boolean isPrimo=true;
		int numero=0;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		numero=entrada.nextInt();
		for(int i=2; i<numero; i++)
		{
			if(numero%i==0)
			{
				isPrimo=false;
			}
		}
		System.out.println("El número introducido es primo? "+isPrimo);
		
		//Practica 9
		//Sumar los pares del 2 al 2000
		
		int cont=2;
		int acum=0;
		while(cont<=2000)
		{
			acum+=cont;
			cont+=2;
		}
		System.out.println("La suma de los pares del 2 al 2000 es: "+acum);
		
		//Practica 10
		//Pedir al usuario el radio de un circulo y mostrar su area
		
		final double  PI=3.14151921863579;
		double radio=0.0;
		double area=0.0;
		System.out.println("Introduce el radio de un círculo: ");
		radio=entrada.nextDouble();
		area=PI*radio*radio;
		System.out.println("El area del circulo es: "+area);
		
		//Practica 11
		//Serie de Fibonacci
		//1 1 2 3 5 8 13
		//Pedir al usuario la cantidad de numeros a mostrarde la serie de Fibonacci
		int posicion=0;
		int fibonacci=1;
		int anterior=1;
		int temporal=0;
		System.out.print("Dame la posicion de fibonacci que quieres calcular: ");
		posicion=entrada.nextInt();
		for(int i=2; i<posicion; i++)
		{
			temporal=fibonacci;
			fibonacci=fibonacci+anterior;
			anterior=temporal;
		}
		System.out.println("El fibonacci de la posicion "+posicion+" es: "+fibonacci);
		
		entrada.close();
	}

}
