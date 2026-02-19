package Ejercicios;
import java.util.Scanner;

public class Multiplo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();

		for (int mul = 0; mul <= 10 ;mul++) {
			int tabla = num * mul; 
			System.out.println(num + " por " + mul + " es igual a " + tabla);
		}
	}
}
