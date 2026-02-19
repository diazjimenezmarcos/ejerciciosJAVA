package Ejercicios;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		numeros(9,5);
		
	}

	public static int numeros(int a, int b) {
		
		int max,min;
		
		if (a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		System.out.println(max);
		
		return max;
	}
}
