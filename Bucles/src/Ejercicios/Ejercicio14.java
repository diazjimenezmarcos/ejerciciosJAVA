package Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        String texto = "*";
	        System.out.println("Dime un numero");
	        int veces = sc.nextInt();

	        for (int i = 0; i <= veces; veces--) {
	            System.out.println(texto);
	            i++;
	        }
	    }
	}