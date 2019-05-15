package com.aserciones1.main;

import java.util.Scanner;

public class Aserciones1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int value=scanner.nextInt();
		assert value>=18:"Not valid";
		System.out.print("value is: "+value);
		scanner.close();
	}

}
