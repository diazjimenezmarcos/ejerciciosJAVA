package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			int resto = num % 2;
			boolean positivo = num > 0;
			int cuadrado = num*num;
			
			if (resto == 0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
			if (positivo == true) {
				System.out.println("El numero es positivo");
			}else {
				System.out.println("El numero es negativo");
			}
			System.out.println("Tu numero al cuadrado es: " + cuadrado);
		System.out.println("Dime otro numero: ");
		int num1 = sc.nextInt();
		num = num1;
		}
	}
}
