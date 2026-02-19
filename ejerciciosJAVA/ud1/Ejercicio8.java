package com;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		boolean mayor;
		mayor = edad >=18;
		
		System.out.println("¿Es mayor de edad? " + mayor); 
	}

}
