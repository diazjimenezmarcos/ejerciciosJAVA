package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		numeros(9,5,6);
		
	}

	public static String numeros(int a, int b, int c) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0,mid = 0,min = 0;
		
		if (a>b && a>c && b>c) {
			max = a;
			mid = b;
			min = c;
		}else if (a>b && a>c && c>b) {
			max = a;
			mid = c;
			min = b; 
		}else if (b>a && b>c && c>a) {
			max = b;
			mid = c;
			min = a; 
		}else if (b>a && b>c && a>c) {
			max = b;
			mid = a;
			min = c; 
		}else if (c>a && c>b && a>b) {
			max = c;
			mid = a;
			min = b; 
		}else if (c>a && c>b && b>a) {
			max = c;
			mid = b;
			min = a; 
		}
		
		System.out.println("El numero mas grande es: " + max + " , el segundo es " + mid + " y el tercero es " + min);
		String solucion = sc.nextLine();
		
		return solucion;
	}
}
