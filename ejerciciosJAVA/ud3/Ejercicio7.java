package Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int mul = 1;

		while(num<20) {
			num *= mul;
			mul+=2;
		}
		
		System.out.println(num);
	}
}
