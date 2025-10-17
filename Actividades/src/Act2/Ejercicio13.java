package Act2;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que hora es: ");
		int hora = sc.nextInt();
		System.out.println("Dime que minuto es: ");
		int minutos = sc.nextInt();
		System.out.println("Dime que segundo es: ");
		int segundos = sc.nextInt();
		
		int suma = segundos + 1;
		
		if (suma == 60) {
			minutos = minutos + 1;
			suma = suma - 60;
			}if (minutos == 60) {
				hora = hora + 1;
				minutos = minutos - 60;
				}if (hora == 24) {
					hora = hora - 24;
				}
			
		if (hora < 10 && minutos < 10 && suma < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + "0" + hora + " : " + "0" + minutos + " : " + "0" + suma);
		}else if (hora < 10 && minutos < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + "0" + hora + " : " + "0" + minutos + " : " + suma);
		}else if (hora < 10 && suma < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + "0" + hora + " : " + minutos + " : " + "0" + suma);
		}else if (minutos < 10 && suma < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + hora + " : " + "0" + minutos + " : " + "0" + suma);
		}else if (hora < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + "0" + hora + " : " + minutos + " : " + suma);
		}else if (minutos < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + hora + " : " + "0" + minutos + " : " + suma);
		}else if (suma < 10) {
			System.out.println("La hora sumandole un segundo es igual a las " + hora + " : " + minutos + " : " + "0" + suma);
		}else if (suma == 0){
			System.out.println("La hora sumandole un segundo es igual a las " + hora + " : " + minutos + " : " + "0" + suma);
		}else if (minutos == 0){
			System.out.println("La hora sumandole un segundo es igual a las " + hora + " : " + "0" + minutos + " : " + suma);
		}else if (hora == 0){
			System.out.println("La hora sumandole un segundo es igual a las " + "0" + hora + " : " + minutos + " : " + suma);}
	}
}
