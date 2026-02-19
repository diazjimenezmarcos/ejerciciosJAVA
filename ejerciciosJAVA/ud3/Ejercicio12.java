package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienes que darme 5 notas");
		int cont = 1;
		int suspensos = 0;
		
		while (cont != 6) {
		System.out.println("Dime la nota numero " + cont + ": ");
		double nota = sc.nextDouble();
			if (nota < 5) {
				suspensos++;
			}
		cont++;
		}

		if (suspensos==0) {
			System.out.println("No hay suspensos");
		}else {
			System.out.println("Han suspendido " + suspensos + " personas.");
		}
	}

}
