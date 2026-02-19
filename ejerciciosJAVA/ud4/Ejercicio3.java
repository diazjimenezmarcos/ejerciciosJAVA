package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	
	datos(2,6,2);
}

public static double datos(double radio, double altura, int opcion) {
	
	double area, volumen, pi;
	pi = 3.14;
	
	if (opcion == 1) {
		area = 2 * pi * radio * (altura + radio);
		System.out.println(area);
	}else if (opcion == 2) {
		volumen = pi * (radio * radio) * altura;
		System.out.println(volumen);
	}
	return opcion;
}
}
