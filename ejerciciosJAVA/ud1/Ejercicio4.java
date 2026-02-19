package com;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime que año es ");
	int año = sc.nextInt();
	System.out.println("¿En que año naciste?");
	int año_nacimiento = sc.nextInt();
	int edad = año - año_nacimiento;
	System.out.println("Tu edad es " + edad);
	
	}
}
