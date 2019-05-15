package com.programas.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String palabra1="";
		String palabra2="";
		char c;
		
		System.out.print("Palabra 1: ");
		palabra1=scan.nextLine();
		System.out.print("Palabra 2: ");
		palabra2=scan.nextLine();
		
		palabra1=palabra1.toLowerCase();
		palabra2=palabra2.toLowerCase();
		
		int cont=0;
		
		boolean isAnagrama=true;
		
		for(int i=0; i<palabra1.length(); i++)
		{
			for(int j=0; j<palabra2.length(); j++)
			{
				if(palabra1.charAt(i)==palabra2.charAt(j))
				{
					cont++;
				}
			}
			if(cont<1)
			{
				isAnagrama=false;
				break;
			}
			else
			{
				cont=0;
			}
		}
		if(isAnagrama)
		{
			System.out.println("Es un anagrama");
		}
		else
		{
			System.out.println("No es un angrama");
		}
	}
}
