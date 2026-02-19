package Act;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
	
		int[][] valor = new int[5][5];
		
		mostrarMatriz(valor);
		
	}
	
	public static void mostrarMatriz(int valor [][]) {
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j<5; j++) {
				valor[i][j] = i + j;
			}
			
			System.out.print("\n");
		}
		
		System.out.println(Arrays.deepToString(valor));
	}
}
