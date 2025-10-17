package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		
		do {
			
		}while(num <= 1);
		
		System.out.println("Estos son los numeros del 1 al " + num);
		for(int i = 1; i <=num; i++) {
			System.out.println(i);
		}
	}

}
