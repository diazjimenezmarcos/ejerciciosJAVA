package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime una edad: ");
	int edad = sc.nextInt();
	int suma = 0;
	int num = 0;
	int cantidad = 0;
	int media = 0;
	
	
	while (edad >= 0) {
		if (edad >= 18) {
		cantidad++;
		System.out.println("La cantidad de alumnos mayores de edad es " + cantidad);
		}else {
			System.out.println("El alumno es menor de edad");
		}
		if (edad >= 1) {
			num++;
			System.out.println("La cantidad de alumnos es " + num);
		}
	
		suma = suma + edad;
		System.out.println("La suma de las edades es " + suma);
		media = suma / num;
		System.out.println("La media es " + media);
		System.out.println("Dime la siguiente edad: ");
		int edad1 = sc.nextInt();
		edad = edad1;
	}
	}
}