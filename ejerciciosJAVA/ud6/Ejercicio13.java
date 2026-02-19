package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = sc.nextLine().toLowerCase();

        for(char letra = 'a'; letra <= 'z'; letra++) {
            int contador = 0;
            for(int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == letra) {
                    contador++;
                }
            }

            if(contador > 0) {
                System.out.println(letra + " : " + contador + " vez / veces.");
            }
        }
    }
}