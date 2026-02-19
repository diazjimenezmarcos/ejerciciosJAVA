package Ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero entre el 1 y el 10");
		int num = sc.nextInt();
		
		while(num >= 1 && num <= 10) {
			for (int x = 0; x <= 10 ;x++) {
				int tabla = num * x; 
				System.out.println(num + " por " + x + " es igual a " + tabla);
			}
			System.out.println("Dime otro numero: ");
			num = sc.nextInt();
		}
		System.out.println("El numero esta fuera de rango");
	}

}
