package com;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int numero = sc.nextInt();
		boolean par_o_impar = numero % 2 == 0;
		System.out.println("¿El numero es par? " + par_o_impar);
	}

}
