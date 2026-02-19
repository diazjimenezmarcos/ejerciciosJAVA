package Ejercicios;

public class Ejercicio6 {
	public static void main(String[] args) {
		Invertida("La palabra es palabra");
	}
	
	public static String Invertida(String palabra) {
		
		String invertida = "";
		for (int i = palabra.length() - 1; i>= 0 ; i--) {
			invertida = invertida + palabra.charAt(i);
		}
	
		System.out.println(invertida);
		return palabra;
	}
}
