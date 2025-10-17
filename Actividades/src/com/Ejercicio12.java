package com;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		int valor_absoluto = Math.abs(num) ;
		System.out.println(valor_absoluto);
	}
}
