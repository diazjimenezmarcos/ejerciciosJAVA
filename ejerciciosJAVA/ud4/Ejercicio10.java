package Ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String [] args) {
		amigos(1184,1210);
	}
	
	public static boolean amigos(int a, int b) {
	
	Scanner sc = new Scanner(System.in);
	
	int sumaa = 0;
	int sumab = 0;
	boolean amigo = false;
	
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sumaa = sumaa + i;
			}
		}
			
		for (int j = 1; j <= b; j++) {
			if (b % j == 0) {
				sumab = sumab + j;
			}
		}
		
		System.out.println("La suma de los divisores de a es " + sumaa);
		System.out.println("La suma de los divisores de b es " + sumab);
		
		if ( sumaa == sumab) {
			amigo = true;
		}
		
		System.out.println("¿Los numeros son amigos?: " + amigo);
		
	return amigo;
		}
	}
