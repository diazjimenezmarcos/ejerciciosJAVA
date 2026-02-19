package Ejercicios;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		esPrimo(8);
}
	
	public static boolean esPrimo (int n) {
		boolean dev = true;
		
		for(int i=2; i<n-1;i++) {
			if(n % i == 0) {
				dev = false;
			}
			
		}
		
		return dev;
	}
}