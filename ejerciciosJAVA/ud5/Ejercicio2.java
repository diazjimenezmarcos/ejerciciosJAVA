package Act;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros vas a guardar: ");
		int cantidad = sc.nextInt();
		
		int[] num = new int[cantidad];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Dime un  numero entero: ");
			num[i] = sc.nextInt();
		}
		
		for (int i = (cantidad - 1) ; i >= 0 ; i--) {
			System.out.println(num[i]);
		}
	}
}
