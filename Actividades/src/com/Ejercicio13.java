package com;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nota del primer trimestre: ");
		int nota1 = sc.nextInt();
		System.out.println("Dime tu nota del segundo trimestre: ");
		int nota2 = sc.nextInt();
		System.out.println("Dime tu nota del tercero trimestre: ");
		int nota3 = sc.nextInt();
		
		float media1;
		media1 = (float)((nota1 + nota2 + nota3)/3.0);
		System.out.println("La nota media con decimales es de " + media1);
		System.out.println("La nota media sin decimales es de " + (int)media1);
		
 		}
}
