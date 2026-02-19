package Ejercicios;
import java.util.Scanner;

public class Act2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String Pregunta = "¿Quieres que te cente el cuento de la buenapipa";
		String palabra_leida;
		
		System.out.println(Pregunta);
		palabra_leida = sc.nextLine();
		
		while (!palabra_leida.equals("fin")) {
			System.out.println(Pregunta);
			palabra_leida = sc.nextLine();
			
		}
		}
}
