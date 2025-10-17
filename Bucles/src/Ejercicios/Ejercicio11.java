package Ejercicios;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = 1;
		
		while(num <= 10) {
			for (int x = 0; x <= 10 ;x++) {
				int tabla = num * x; 
				System.out.println(num + " por " + x + " es igual a " + tabla);
			}
			num++;
		}
	}

}
