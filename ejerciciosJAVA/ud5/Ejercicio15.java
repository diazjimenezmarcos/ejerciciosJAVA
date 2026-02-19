package Act;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		
	}
	
	public static int rellenaPares(int[] t) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int impares = 0;
		
		for (int i = 0 ; i<t.length ; i++) {
			
			System.out.println("Dime un numero: ");
			valor = sc.nextInt();
			
			if (t[i] % 2 == 0) {
				t[i] = i;
			}else {
				impares++;
			}
		}
		
		System.out.println(Arrays.toString(t));
		return impares;
	}
	
}
