package Ejercicios;

public class Ejemplo {
	public static void main(String[] args) {
		System.out.println("Hola");
		saludar ("pablo");
		saludar ("Maria");
		int n = Math.max(4, 5);
		System.out.println(n);
		
		int siguiente = maximo(10,9) + 1;
		System.out.println(siguiente);
	}
	
	public static void saludar() {
		System.out.println("Hola");
	}
	
	public static void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}
	public static int maximo(int a, int b) {
		return Math.max(a,b);
	}
	public static String mostrar(String mensaje) {
		System.out.println(mensaje);
		return (mensaje);
	}
	public static int mostrar(int numero) {
		System.out.println(numero);
		return (numero);
	}
	public static void mostrar(String mensaje, int veces) {
		while (veces>0) {
			System.out.println(mensaje);
			veces--;
		}
	}
}
