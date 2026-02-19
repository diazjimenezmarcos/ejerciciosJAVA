package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una palabra: ");
        String palabra1 = sc.nextLine().toLowerCase();

        System.out.println("Dame otra palabra: ");
        String palabra2 = sc.nextLine().toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagramas.");
            return;
        }

        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Sí son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }

    }
}