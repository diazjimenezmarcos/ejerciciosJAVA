package Act;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int cantidad;
	
	System.out.println("De que longitud quieres la combinacion: ");
	cantidad = sc.nextInt();
	
	int[] num = new  int[cantidad];
	int i = 0;
	
	while (i != cantidad) {
		num[i] = (int) ((Math.random() * 5) + 1);
		i++;
	}
	i = 0;
	
	while (i != 5) {
		System.out.println("Dime el digito numero " + i + " : ");
		int digito = sc.nextInt();
		
		if (num[i] == digito) {
			System.out.println("Acertaste");
			i++;
		}else if (num[i]<digito) {
			System.out.println("El digito en esta posicion es mas pequeño");
			System.out.println("Intentalo otra vez");
		}else if (num[i]>digito) {
			System.out.println("El digito en esta posicion es mas grande");
			System.out.println("Intentalo otra vez");;
		}
	}
	
	System.out.println("Enhorabuena");
	
	}
}
