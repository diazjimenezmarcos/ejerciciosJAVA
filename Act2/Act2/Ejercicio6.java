package Act2;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int num1 = sc.nextInt();
		System.out.println("Dime otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
			System.out.println(num2);
		}else {
			System.out.println(num2);
			System.out.println(num1);
		}
	}

}
