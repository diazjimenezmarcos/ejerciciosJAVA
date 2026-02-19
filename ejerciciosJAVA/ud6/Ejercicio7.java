package Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String frase,palabra;
		
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();
		
		System.out.println("Que palabra quieres buscar: ");
		palabra = sc.nextLine();
		
		int index = frase.indexOf(palabra);
		
		int i = 0;
		
		do {
			int indice = index+palabra.length();
			index = frase.indexOf(palabra, indice);
			i++;
		}while(index >= 0);
		
		
		System.out.println("La palabra se repite " + i + " veces.");
	}
}
