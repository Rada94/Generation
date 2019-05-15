package com.fpjpractica1.main;

import java.util.Scanner;

public class Fpjpractica2 {

	public static void main(String[] args) {
		//Practica 4
		//Introducir los dias de la semana y mostrar el en dia de la semana en cadena
		
		int diaSemana=0;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el dia de la semana: ");
		diaSemana=entrada.nextInt();
		switch(diaSemana)
		{
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia invalio...");
			
		}
		//Practica 5
		//Pedir edad al usuario. Si el usuario es menor a 5 años, entonces mostrar niño, si es mayor o igual a 5 y menor a 18 mostrar adolecente,
		//mayor a 18 y menor a 36 mostrar chavorruco, 37 mostrar Macho Castigador, y mayor a 37 viejito.
		int edad=0;
		System.out.print("Introduce tu edad: ");
		edad=entrada.nextInt();
		if(edad<5)
		{
			System.out.println("Eres un niño");
		}
		else
		{
			if(edad>=5 && edad<18)
			{
				System.out.println("Eres un adolecente");
			}
			else
			{
				if(edad>=18 && edad<37)
				{
					System.out.println("Eres un chavorruco");
				}
				else
				{
					if(edad==37)
					{
						System.out.println("Eres un Macho Castigador");
					}
					else
					{
						if(edad>37)
						{
							System.out.println("Eres un viejito");
						}
					}
				}
			}
		}
		
		//Practica 6
		//
		
		entrada.close();
	}
}
