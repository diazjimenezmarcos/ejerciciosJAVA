package Ejercicios;

public class Ejercicio8 {
	public static void main(String[] args) {
		divisoresPrimos(500);
	}
	public static int divisoresPrimos(int numero) {
			int contador = 0;
			for (int i = 2;i < numero ; i++) {
				if (Ejercicio7.esPrimo(i) && numero % i == 0) {
					contador++;
				}
			}
			
			System.out.println(contador);
			
			return contador;
		}
	}