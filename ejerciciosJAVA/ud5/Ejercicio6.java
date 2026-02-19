package Act;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] puntos = new int[5];
		
		for(int i = 0;i<puntos.length;i++) {
			System.out.println("Dime una puntuación: ");
			puntos[i] = sc.nextInt();
		}
		
		int nuevaPuntuacion;
		
		for (int i = 0 ; i != -1; i++) {
			System.out.println("Añade un valor de exhibición: ");
			nuevaPuntuacion = sc.nextInt();
			
			if (nuevaPuntuacion == -1) {
				break;
			}
			
			puntos = Arrays.copyOf(puntos, puntos.length + 1);
			puntos[puntos.length - 1] = nuevaPuntuacion;
		}
		
		Arrays.sort(puntos);
		System.out.println("Todas las puntuaciones ordenadas son : " + Arrays.toString(puntos));
	}
}
