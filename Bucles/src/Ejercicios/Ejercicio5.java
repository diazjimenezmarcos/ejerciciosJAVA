package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero: ");
		int n = sc.nextInt();
		System.out.println("Dime otro numero: ");
		int m = sc.nextInt();
		System.out.println("Dime un numero que este dentro de los dos numeros introducidos: ");
		int x = sc.nextInt();
		
		while (x > n && x >m || x < m && x < n) {
			System.out.println("Dime otro numero: ");
			x = sc.nextInt();
		}
		
		System.out.println("Número dentro de rango");
	}
	
}
