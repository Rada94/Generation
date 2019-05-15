package com.colecciones1.main;

import java.util.PriorityQueue;

public class Colecciones1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> arreglo=new PriorityQueue<Integer>();
		arreglo.add(80);
		arreglo.add(5);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(70);
		arreglo.add(90);
		arreglo.add(6);
		
		System.out.println(arreglo.peek());
		System.out.println(arreglo);
		System.out.println(arreglo.poll());
		System.out.println(arreglo);
		
	}
}
