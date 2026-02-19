package Ejercicios;
import java.util.Scanner;

public class Ejercicio5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String consonantes = "";
        
        System.out.println("Dime tu nombre: ");
        nombre = sc.nextLine();
        
        final String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            
            if (!vocales.contains(String.valueOf(caracter))) {
                consonantes = consonantes + caracter;
            }
        }
        
        System.out.println(consonantes);
    }
}