package Act;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = {1,2,3,4,5};
		int aux;
		
		do {
			System.out.println("Dime el indice: ");
			int i = sc.nextInt();
			
			if (i>=num.length || i < 0) {
				continue;
			}
			
			aux = num[num.length-1];
			num[i] = aux;
			num = Arrays.copyOf(num, num.length - 1);
			
			mostrar(num);
			
		}while (num.length>0);
		
		System.out.println("Fin");
		
	}
	
	public static void mostrar(int[] tabla) {
		System.out.print(" [ \t");
		for(int i = 0 ; i < tabla.length ; i++) {
			System.out.print("\t" + tabla[i] + "\t");
		}
		System.out.print("\t ] ");
	}
}
