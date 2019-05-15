package com.algoritmos1.main;

import java.util.Scanner;

public class Algoritmos1 {

	public static void main(String[] args) {
		
		/*Score
		int score=80;
		int bandera;
		if(score>=80)
		{
			//System.out.println("Pasa :D");
			bandera=1;
		}
		else
		{
			if(score>=60)
			{
				//System.out.println("Panza:)");
				bandera=2;
			}
			else
			{
				//System.out.println("Ya valio");
				bandera=3;
			}
		}
		
		//Score con Switch
		switch(bandera)
		{
		case 1:
			System.out.println("Pasa :D");
			break;
		case 2:
			System.out.println("Panza :)");
			break;
		case 3:
			System.out.println("Ya valio");
		}*/
		
		//Cuantos dias faltan para el fin de año;
		int mes;
		int dia=0;
		int diaUsuario;
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingrese el número de mes (1 a 12): ");
		mes=entrada.nextInt();
		System.out.print("Ingrese el dia en que estas: ");
		diaUsuario=entrada.nextInt();
		
		
		switch(mes)
		{
		case 1:
			dia+=31;
		case 2: 
			dia+=28;
		case 3:
			dia+=31;
		case 4:
			dia+=30;
		case 5:
			dia+=31;
		case 6: 
			dia+=30;
		case 7:
			dia+=31;
		case 8:
			dia+=31;
		case 9:
			dia+=30;
		case 10: 
			dia+=31;
		case 11:
			dia+=30;
		case 12:
			dia=(dia+31)-diaUsuario;
		}
		System.out.println("Dias que faltan: "+dia);
		entrada.close();
	}

}
