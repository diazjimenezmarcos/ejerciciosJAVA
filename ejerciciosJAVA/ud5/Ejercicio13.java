package Act;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main (String[] args) {
		
		int[] tabla = {3,5,4,7};
		
		System.out.println(maximo(tabla));
	}
	
	public static int maximo(int[] t) {
		int max = Integer.MIN_VALUE;
		for (int numero : t) {
			if(numero > max) {
				max = numero;
			}
		}
		return max;	
	}
	
}
