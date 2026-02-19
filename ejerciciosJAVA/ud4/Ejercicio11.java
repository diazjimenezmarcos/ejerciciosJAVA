package Ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		elevado(2,2);
		
		elevadoRecursivo(2,2);
		
	}
	
	public static int elevado(int a, int n) {
		
		int producto = a;
		
		for (int i = 1; i != n; i++) {
			if (n < 0) {
				System.out.println("El numero debe ser positivo");
			}else {
				producto = producto * a;
			}
		}
		
		System.out.println("La funcion de forma iterativa es " + producto);
		
		
		return producto;
	}
	
	public static int elevadoRecursivo(int a, int n) {
		
			if(n == 0) {
				return 1;
			}else {
				return a * elevadoRecursivo(a,n-1);

			}
	}
	
	
	
}
