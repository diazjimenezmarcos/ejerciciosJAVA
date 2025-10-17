package Act2;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num = sc.nextInt();
		int unidades = 0;
		int decenas = 0;
		int centenas = 0;
		int millares = 0;
		
		
		if (num < 10 && num > 0) {
			System.out.println("No es capicúa (solo 1 cifra).");
			}else if (num<100 && num > 0) {
				unidades = num % 10;
				decenas = num / 10;
				if (unidades == decenas) {
					System.out.println("El numero es capicua");
				}else {
					System.out.println("El numero no es capicua");}
			}else if(num<1000 && num > 0) {
				unidades = num % 10;
				centenas = num / 100;
				if (unidades == centenas) {
					System.out.println("El numero es capicua");
				}else{
					System.out.println("El numero no es capicua");}
			}else if(num<10000 && num > 0) {
				unidades = num % 10;
				millares = num / 1000;
				if (unidades == millares && decenas == centenas) {
					System.out.println("El numero es capicua");
				}else {
					System.out.println("El numero no es capicua");}
			}else if (num > 10000 || num < 0) {
				System.out.println("El numero se sale de rango");
			}
	}
}	