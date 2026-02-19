package Ejercicios;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienes que darme 6 notas");
		int cont = 1;
		int suspensos = 0;
		int aprobados = 0;
		int condicionados = 0;
		
		while (cont != 7) {
		System.out.println("Dime la nota numero " + cont + ": ");
		double nota = sc.nextDouble();
			if (nota < 4) {
				suspensos++;
			}
			if (nota > 4) {
				aprobados++;
			}
			if (nota == 4) {
				condicionados++;
			}
		cont++;
		}

		if (suspensos==0) {
			System.out.println("No hay suspensos");
		}else if(suspensos >0){
			System.out.println("Han suspendido " + suspensos + " personas.");
		}
		if (aprobados==0) {
			System.out.println("No hay aprobados");
		}else if(aprobados >0){
			System.out.println("Han aprobado " + aprobados + " personas.");
		}
		if (condicionados==0) {
			System.out.println("No hay condicionados");
		}else if(condicionados >0){
			System.out.println("Han condicionado " + condicionados + " personas.");
		}
	}

}
