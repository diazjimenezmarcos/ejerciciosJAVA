package com;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double PRECIO_PERA = 2.35 ;
		final double PRECIO_MANZANA = 1.95 ;
		System.out.println("¿Cuantos kilos de peras se han vendido el primer semestre?: ");
		double peras1 = sc.nextInt();
		System.out.println("¿Cuantos kilos de manzanas se han vendido el primer semestre?: ");
		double manzanas1 = sc.nextInt();
		System.out.println("¿Cuantos kilos de peras se han vendido el segundo semestre?: ");
		double peras2 = sc.nextInt();
		System.out.println("¿Cuantos kilos de manzanas se han vendido el segundo semestre?: ");
		double manzanas2 = sc.nextInt();
		
		double ventas_peras = (peras1 + peras2) * PRECIO_PERA;
		double ventas_manzanas = (manzanas1 + manzanas2) * PRECIO_MANZANA;
		
		System.out.println("El importe total de peras es de " + ventas_peras + "$");
		System.out.println("El importe total de manzanas es de " + ventas_manzanas + "$");
	}
}
