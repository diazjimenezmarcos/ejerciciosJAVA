package Ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase,traducida;
		String inicio = "Javalín, javalón";
		String cierre = "javalén, len, len";
		
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();
		
		int index_i = frase.indexOf(inicio);
		int index_c = frase.indexOf(cierre);
		traducida = frase;
		
		if (index_i >= 0) {
			traducida = frase.replaceAll(inicio, "");
		}
		if (index_c >= 0) {
			traducida = frase.replaceAll(cierre, "");
		}
		
		System.out.println(traducida.trim());
	}
}
