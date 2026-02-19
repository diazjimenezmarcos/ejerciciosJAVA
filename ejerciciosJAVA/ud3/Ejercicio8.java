package Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		int op = 1;
		for (int i = num;i>0;i--) {
			op *= i;
			System.out.println(op);
			
		}
	}
}
