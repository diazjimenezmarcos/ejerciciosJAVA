package Act2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
