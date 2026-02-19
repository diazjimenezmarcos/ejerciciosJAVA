package Ejercicios;
import java.util.Scanner;

public class Ejercicio2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña, pedir;
		int ultimo;
		
		System.out.println("Dime la contraseña");
		contraseña = sc.nextLine();
		
		System.out.println("Adivina la contraseña: ");
		pedir = sc.nextLine();
	
		ultimo = contraseña.length();
		
		while(contraseña.equals(pedir) == false) {
			if (contraseña.length() > pedir.length() ) {
				System.out.println("La palabra es mas corta");
			}else {
				System.out.println("La contraseña es mas corta");
			}
			System.out.println("Prueba otra vez");
			pedir = sc.nextLine();
		}
		
		System.out.println("Has acertado");
		
	}
}
