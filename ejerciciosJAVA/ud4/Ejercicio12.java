package Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
	
	datos(6,6,1);
	datos(6,3,2);
	datos(2,9,3);
	datos(3,0,4);
}

public static double datos(double num1, double num2, int opcion) {
	Scanner sc = new Scanner(System.in);
	double suma,resta,producto,division;
	
	if (opcion == 1) {
		suma = num1 + num2;
		System.out.println(suma);
	}else if (opcion == 2) {
		resta = num1 - num2;
		System.out.println(resta);
	}else if (opcion == 3) {
		producto = num1 * num2;
		System.out.println(producto);
	}else if (opcion == 4) {
		if (num2 == 0) {
			System.out.println("No puedo dividir por 0");
		}else {
		division = num1 / num2;
		System.out.println(division);
		}
	}
	return opcion;
}
}
