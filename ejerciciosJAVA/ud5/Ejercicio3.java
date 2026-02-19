package Act;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros vas a guardar: ");
		int cantidad = sc.nextInt();
		int positivos = 0;
		int negativos = 0;
		int cont_pos = 0;
		int cont_neg = 0;
		int ceros = 0;
		double media_positivos = 0;
		double media_negativos = 0;
		
		int[] num = new int[cantidad];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Dime un  numero entero: ");
			num[i] = sc.nextInt();
			
			if (num[i] > 0) {
				cont_pos++;
				positivos = positivos + num[i];
			}else if (num[i] == 0) {
				ceros++;
			}else if (num[i] < 0) {
				cont_neg++;
				negativos = negativos + num[i];
			}
			
		}
		
		media_positivos = positivos / cont_pos;
		media_negativos = negativos / cont_neg;
		
		System.out.println("La media de los numeros positivos es : " + media_positivos);
		System.out.println("La media de los numeros negativos es : " + media_negativos);
		System.out.println("La cantidad de ceros introducidos es : " + ceros);
	}
}