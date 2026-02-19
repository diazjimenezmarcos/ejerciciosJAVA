package com;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		double num = sc.nextDouble();
		
		double redondeado = Math.round(num);
		System.out.println("El numero redondeado es " + redondeado);
	}
}
