package Act2;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número decimal: ");
		double num = sc.nextDouble();
		
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("El numero es casi-cero");
		}else {
			System.out.println("El numero no es casi-cero");
		}
	}

}
