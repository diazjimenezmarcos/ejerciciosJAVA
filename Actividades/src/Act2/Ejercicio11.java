package Act2;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cual es tu nota del 0 al 10: ");
		int nota = sc.nextInt();
		
		if (nota>=0 && nota<=4){
			System.out.println("Insuficiente");
		}else if (nota == 5) {
			System.out.println("Suficiente");
		}else if (nota == 6) {
			System.out.println("Bien");
		}else if (nota >=7 && nota <=8) {
			System.out.println("Notable");
		}else if (nota >=9 && nota <=10) {
			System.out.println("Sobresaliente");
		}
	}
}