package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	
	numeros(2,9);
	
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
	
	while(max>(min + 1)) {
		max--;
		System.out.println(max);
	}
	return max;
}


}
