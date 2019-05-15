package com.tests.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String palabra=scan.nextLine();
		char[] nuevaPalabra=new char[palabra.length()];
		
		System.out.println((char)((int)palabra.charAt(0)-32));
		
		if((int)palabra.charAt(0)>=97 && (int)palabra.charAt(0)<=122)
		{
			for(int i=0; i<palabra.length(); i++)
			{
				nuevaPalabra[i]=palabra.charAt(i);
			}
			nuevaPalabra[0]=(char)((int)palabra.charAt(0)-32);
			
		}
		
		System.out.println(nuevaPalabra);
		scan.close();

	}

}
