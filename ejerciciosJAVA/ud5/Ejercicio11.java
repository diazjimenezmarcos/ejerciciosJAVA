package Act;
import java.util.Scanner;

public class Ejercicio11 {
	static int[][] matrizMagica = {{1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
	public static void main(String[] args) {
		
		try {
			System.out.println(sumaFila(matrizMagica, 2));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static int sumaFila(int[][] matriz, int posicion) throws Exception {
		
		int[] fila = matriz[posicion];
		
		if (posicion >= matriz.length) {
			throw new Exception("Fuera de rango");
		}
		
		int acumulador = 0;
		
		for (int numero : fila) {
			acumulador += numero;
		}
		
		return acumulador;
	}
	
}
