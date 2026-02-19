package Ejercicios;

public class Ejercicio6 {
	public static void main(String[] args) {
		vocal("e");
	}
	
	public static boolean vocal(String vocal) {
		
		boolean probar;
		
		if (vocal == "a" || vocal == "e" || vocal == "u" || vocal == "i" || vocal == "o") {
			probar = true;
		}else {
			probar = false;
		}
		System.out.println(probar);
		return probar;
	}
}
