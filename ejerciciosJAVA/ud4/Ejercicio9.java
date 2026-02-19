package Ejercicios;

public class Ejercicio9  {
	public static void main(String[] args) {
		divisoresPrimos(42);
	}
	public static int divisoresPrimos(int numero) {
			int contador = 0;
			for (int i = 2;i < numero ; i++) {
				if (Ejercicio7.esPrimo(i) && numero % i == 0) {
					System.out.println(i);
					contador++;
				}
			}
			
			System.out.println("Hay " + contador + " divisores primos.");
			
			return contador;
		}
	}