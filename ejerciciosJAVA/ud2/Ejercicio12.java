package Act2;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que dia es: ");
		int dia = sc.nextInt();
		System.out.println("Dime que mes es: ");
		int mes = sc.nextInt();
		System.out.println("Dime que año es: ");
		int año = sc.nextInt();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				if (dia >= 1 && dia <= 31) {
				System.out.println("La fecha " + dia + " del mes " + mes + " del año " + año + " es correcta");
				}else {
				System.out.println("La fecha es incorrecta");}
			}else if (mes == 2){
				if (dia >= 1 && dia <= 28) {
					System.out.println("La fecha " + dia + " del mes " + mes + " del año " + año + " es correcta");
				}else {
					System.out.println("La fecha es incorrecta");}
			}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
				if (dia >= 1 && dia <= 30) {
					System.out.println("La fecha " + dia + " del mes " + mes + " del año " + año + " es correcta");
				}else {
					System.out.println("La fecha es incorrecta");}
			}
	}

}
