package Ejercicios;

public class Ejercicio13 {
	public static void main(String[] args) throws Exception {
		
		System.out.println(factorialRecursivo(-56));
	}
	
	public static int factorialRecursivo(int num) throws Exception{
		
		if (num < 0) {
			throw new Exception("No puede ser negativo");
		}
		
		if (num == 1 || num == 0) {
			return 1;
		}else {
			return num * factorialRecursivo(num - 1);
		}
		
	}
	
}
