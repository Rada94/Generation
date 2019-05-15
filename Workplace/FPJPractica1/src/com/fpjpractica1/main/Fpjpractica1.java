package com.fpjpractica1.main;

import java.util.Scanner;

public class Fpjpractica1 {

	public static void main(String[] args) {
		//Practica 1
		//Mostrar Hola Mundo
		System.out.println("Hola Mundo");

		//Practica 2
		//Aceptar un valor desde el teclado
		//PAra aceptar un valor del teclado se necesita el objeto Scanner y la o las variables en donde se almacenaran los valores
		String nombre="";
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		nombre=entrada.nextLine();
		System.out.println("Tu nombre es: "+nombre);
		
		//Practica 3
		//Introducir labae y la altura de un triángulo y calcular su area
		int base=0;
		int altura=0;
		double area=0.0;
		
		System.out.println("Dame la base: ");
		base=entrada.nextInt();
		System.out.println("Dame la altura: ");
		altura=entrada.nextInt();
		area=base*altura/2;
		System.out.println("El área es: "+area);
		
		entrada.close();
		//Practica 4
		//
		
	}

}
