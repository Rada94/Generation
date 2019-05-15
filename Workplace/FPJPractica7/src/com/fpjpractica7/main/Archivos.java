package com.fpjpractica7.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) {
		FileReader reader=null;
		BufferedReader buffer=null;
		String linea="";
		
		try
		{
			reader=new FileReader("C:\\A\\HolaMundo.java");
			buffer=new BufferedReader(reader);
			linea=buffer.readLine();
			while(linea!=null)
			{
				System.out.println(linea);
				linea=buffer.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
		}
	}

}
