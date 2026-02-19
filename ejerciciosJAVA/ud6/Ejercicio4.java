package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase,espacios;
		
		System.out.println("Dime una frase: ");
		frase = sc.nextLine().trim();
		espacios = frase.replaceAll(" ", "");
		int n = frase.length() - espacios.length();

		System.out.println("Hay " + n + " espacios.");
	}
}
