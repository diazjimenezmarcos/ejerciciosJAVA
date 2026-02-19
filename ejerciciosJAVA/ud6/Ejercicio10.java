package Ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		String conjunto1= "eikmpqrstuv";
		String conjunto2= "pviumterkqs";
	
		System.out.println("Dime una palabra: ");
		palabra = sc.nextLine();
		
		palabra = palabra.toLowerCase();
		
		for (int i = 0;i<palabra.length() - 1;i++) {
			for(int j = 0;j<conjunto1.length() - 1;j++) {
				if (palabra.charAt(i) == conjunto1.charAt(j)) {
					palabra = palabra.replace(palabra.charAt(i), conjunto2.charAt(j));
				}
			}
		}
		
		System.out.println(palabra);
	}
}
