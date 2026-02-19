package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String consonantes = "";
		
		System.out.println("Dime tu nombre: ");
		nombre = sc.nextLine();
		
		final String vocales = "aeiouAEIOUáéíóú";
		
		int letras = 0;
		
		for (int i = 0; i<nombre.length();i++) {
			
			if (nombre.charAt(letras) == vocales.charAt(i)) {
				letras++;
			}else {
				consonantes = consonantes + nombre.charAt(letras);
			}
		}
		
		System.out.println(consonantes);
	}
}
