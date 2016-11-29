package de.marmite;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog{
	
	static String read(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String text = "null";
		
		try {
			 text = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static void main(String[] args){
		System.out.println("Eingabe:");
		
		String eingabe = read();
		
		System.out.println(eingabe.toUpperCase());
		
	}
}