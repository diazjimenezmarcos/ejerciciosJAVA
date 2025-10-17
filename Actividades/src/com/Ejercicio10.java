package com;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println("Todas las preguntas deben responderse con true o false");
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Esta lloviendo? ");
		boolean llueve = sc.nextBoolean();
		System.out.println("¿Has acabado la tarea? ");
		boolean tarea = sc.nextBoolean();
		System.out.println("¿Vas a la biblioteca? ");
		boolean biblioteca =  sc.nextBoolean();
		boolean salir = (!llueve && tarea) || (biblioteca);
		System.out.println("¿Podra salir? " + salir);
	}
}
