package Homework1;

import java.io.*;

public class Nuke2 {
	
	public static void main(String arg []){
		try{
		BufferedReader keyboard;
		String line;
		int i = 0;
		
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		line = keyboard.readLine();
		i = line.length();
		System.out.printf(line.substring(0,1));
		System.out.println(line.substring(2,i));
		}
		catch (Exception e){
			System.out.println("test"+e);
		}
	}
	
	
	
}