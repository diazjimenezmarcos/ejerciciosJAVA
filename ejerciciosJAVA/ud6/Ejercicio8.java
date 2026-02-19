package Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();
		
		String invertida = Ejercicio6.Invertida(frase);
		
		String frase1 = frase.replaceAll(" ", "");
		String invertida1 = invertida.replaceAll(" ", "");
		
		if (invertida1.equalsIgnoreCase(frase1)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase no es palindroma");
		}
	}
}