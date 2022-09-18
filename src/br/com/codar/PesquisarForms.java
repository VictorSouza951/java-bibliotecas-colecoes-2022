package br.com.codar;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PesquisarForms {
	

	public static void findWord(){
		
	        try{
	             BufferedReader input = new BufferedReader(
	                        new InputStreamReader(
	                        new FileInputStream("formulario.txt")));
	            String line;
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            
	            
	           System.out.println("formulario.txt" +": "+ list);

	            input.close();
	        }
	        catch(Exception ex){
	            ex.printStackTrace();
	        }
	    }

}
