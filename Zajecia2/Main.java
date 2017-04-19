package kolo2;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args){
		
		StringBuilder builder = new StringBuilder();
		
		Scanner s = new Scanner(System.in);
		//System.out.println(s);
		
		String test = "Pierwszy string i dalsze wartosci";
		String text1 = new String();
		String[] podzielonyNapis = test.split(" ");
		
		for (String string : podzielonyNapis) {
			System.out.println(string);
		}
		
		String doPorownania = "Text do porownania";
		
		if(test.equals(doPorownania)){
			System.out.println("Sa takie same");
		}else{
			System.out.println("Nie sa takie same");
		}
		
		System.out.println(Tablica.getNazwa());
		Tablica tablica = new Tablica("Nasz string");
		
	//	tablica.mojToString();
		System.out.println(tablica);
		//System.out.println(tablica.tekstTablicy);
		
		
		
		
		
		Kwadrat k = new Kwadrat()
	}
	
	

}
