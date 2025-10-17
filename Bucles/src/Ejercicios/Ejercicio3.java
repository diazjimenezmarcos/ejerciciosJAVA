package Ejercicios;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Random random = new Random();
		 int num = random.nextInt(100) + 1;
		    System.out.println(num);
		 int num1 = 0;
		 
		 System.out.println("Adivina un numero del 1 al 100: ");
		 System.out.println("Escribe -1 para rendirte");
		 
		 while (num1 != -1 || num1 != num) {
			System.out.println("Di otro numero: ");
			 
		 }
	}
}
