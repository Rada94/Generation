package com.fpjpractica5.main;

import java.util.Scanner;

public class Aserciones {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int value=scanner.nextInt();
		try
		{
			assert value>=18:"Not valid";
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//System.out.println("Edad introducida: "+value);
		}
		System.out.print("value is: "+value);
		scanner.close();
	}

}
