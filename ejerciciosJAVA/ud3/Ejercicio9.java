package Ejercicios;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int arbol;
		int etiqueta = 0;
		int max_altura = 0;
		int arbol_mas_alto = 0;
		
		do {
			System.out.println("Cual es la altura del arbol: " + etiqueta);
			arbol = sc.nextInt();
			if (arbol>max_altura) {
				max_altura = arbol;
				arbol_mas_alto = etiqueta;
			}
			etiqueta++;
		}while (arbol != -1); 
				System.out.println("El arbol mas alto es el " + arbol_mas_alto);
	}
		
	}


