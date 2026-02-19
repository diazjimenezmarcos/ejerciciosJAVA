package Act2;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuanto vale a: ");
		int a = sc.nextInt();
		System.out.println("Dime cuanto vale b: ");
		int b = sc.nextInt();
		System.out.println("Dime cuanto vale c: ");
		int c = sc.nextInt();
		
		double raiz = ((b*b) - 4*a*c);
		double positivo = (-b +(Math.sqrt(raiz)))/(2*a);
		double negativo = (-b -(Math.sqrt(raiz)))/(2*a);
		
		if(a == 0 || raiz < 0) {
			System.out.println("No tiene solucion");
		}else if (raiz == 0){
			System.out.println("Solo hay una solucion y es " + positivo);
		}else {
			System.out.println("El resultado es " + positivo + " y " + negativo);
		}
	}

}
