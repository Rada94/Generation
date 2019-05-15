package com.fpjpractica8.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivos {

	public static void main(String[] args) {
		File archivo=null;
		FileWriter pw=null;
		BufferedWriter buffer=null;
		
		try 
		{
			archivo=new File("C:\\A\\c.txt");
			pw=new FileWriter(archivo);
			buffer=new BufferedWriter(pw);
			
			for(int i=0; i<100; i++)
			{
				buffer.write("Hola_Mundo_");
			}
			
			pw.write("Hola puto ");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				buffer.close();
				pw.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
