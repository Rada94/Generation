package com.datastructures.main;

import java.util.HashMap;
import java.util.Map;

public class DataStructures 
{
	public static void main(String[] args) 
	{
//		List<String> miLista=new ArrayList<String>();
//		int contadorPajaros=0;
//		
//		miLista.add("Pajaro");
//		miLista.add("Perro");
//		miLista.add("Gato");
//		miLista.add("Pajaro");
//		miLista.add("Perico");
//		miLista.add("Pajaro");
//		
//		Iterator <String>miIterator=miLista.iterator();
//		
//		for(String lista:miLista)
//		{
//			System.out.println("Elemento: "+lista);
//		}
//		
//		System.out.println();
//		
//		while(miIterator.hasNext())
//		{
//			if(miIterator.next().equals("Pajaro"))
//			{
//				contadorPajaros++;
//			}
////			System.out.println("Elemento: "+miIterator.next());
//			
//		}
//		
//		System.out.println();
//		System.out.println("Elemento en la posición 2: "+miLista.get(2));
//		System.out.println("¿Se encuentra 'Pajaro'? "+miLista.contains("Pajaro"));
//		System.out.println("¿Donde se encuentra 'Pajaro'? \nEstá en la posición "+miLista.indexOf("Pajaro")+" de la lista");
//		System.out.println("¿Donde es encuentra el ultimo 'Pajaro'? \nEstá en la posición "+miLista.lastIndexOf("Pajaro")+" de la lista");
//		System.out.println("Hay "+contadorPajaros+" pajaros");
//		
//		System.out.println();
//		Collections.sort(miLista);
//		for(String lista:miLista)
//		{
//			System.out.println("Elemento: "+lista);
//		}
		
		HashMap<String, Double> miMapa=new HashMap<String, Double>();
		miMapa.put("Tacos Cuesillo", 24.0);
		miMapa.put("Tacos de Cabeza", 18.0);
		miMapa.put("Tacos de Cachete", 12.0);
		miMapa.put("Tacos de Pastor", 10.0);
		
		for(Map.Entry<String, Double> miEntry: miMapa.entrySet())
		{
			System.out.println("Elemento: <\""+miEntry.getKey()+"\", "+miEntry.getValue()+">");
		}
	}
}
