package com;
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cual es el radio?: ");
	int radio = sc.nextInt();
	double Pi = (3.14);
	double longitud = 2 * radio * Pi;
	double area = Pi * radio * radio;
	System.out.println("La longitud es: " + longitud);
	System.out.println("El área es: " + area);
	
}
}
