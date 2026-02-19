package Act;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		int[] tabla = {3,4,5,6,7,8};
		int[] ganadora = {3,4,5,6,7,8};
		
		comparativa(tabla,ganadora);
		
	}
	
	public static void comparativa(int[] t, int[] g) {
		
		int num = 0;
		int aciertos = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			num++;
			if (t[i] == g[i]) {
				System.out.println("El numero en la posición " + num + " es correcto ");
				aciertos++;
			}else {
				System.out.println("El numero en la posición " + num + " es incorrecto ");
			}
		}
		
		if (aciertos == 6) {
			System.out.println("Enhorabuena");
		}
		
		System.out.println("El numero de aciertos es " + aciertos);
		
	}
	
}
