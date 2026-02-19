package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña, pedir;
		int ultimo;
		
		System.out.println("Dime la contraseña");
		contraseña = sc.nextLine();
		ultimo = contraseña.length() - 1;
		
		do {
			
			System.out.println("Adivina la contraseña: ");
			pedir = sc.nextLine();
			
		}while(!contraseña.equals(pedir)); {
			System.out.println("El numero de caracteres de la contraseña es " + contraseña.length() + " , el primer caracter es " + contraseña.charAt(0) + " , y el ultimo caracter es " + contraseña.charAt(ultimo - 1));
			System.out.println("Prueba otra vez");
			pedir = sc.nextLine();
		}
		
		System.out.println("Has acertado");
		
	}
}
