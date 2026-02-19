package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		
		System.out.println("Dime una palabra: ");
		palabra1 = sc.nextLine();
		
		System.out.println("Dime otra palabra: ");
		palabra2 = sc.nextLine();
		
		if (palabra1.length() > palabra2.length() ) {
			System.out.println("La segunda palabra es mas corta");
		}else {
			System.out.println("La primera palabra es mas corta");
		}
		
	}
}
