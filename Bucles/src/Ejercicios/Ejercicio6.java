package Ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int mul = 0;
		
		for (num = 7; mul <= 14 ;mul++) {
			int tabla = num * mul; 
			System.out.println(num + " por " + mul + " es igual a " + tabla);
		}
		
	}
}
