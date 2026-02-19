package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		String frase = "";
		final String fin = "fin";
		
		System.out.println("Dime una palabra: ");
		palabra = sc.nextLine();
		
		while(!palabra.equalsIgnoreCase(fin)) {
			frase = frase + " " + palabra;
			System.out.println("Dime otra palabra ");
			palabra = sc.nextLine();
		}
	
		System.out.println(frase.trim());
		
	}
}
