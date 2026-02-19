package Ejercicios;

public class Ejercicio14 {
	public static void main(String[] args) throws Exception {
		
		System.out.println(fibonacci(9
				));
	}
	
	public static int fibonacci(int num) throws Exception{
		
		if (num < 0) {
			throw new Exception("No puede ser negativo");
		}
		
		if (num == 1 || num == 0) {
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
		
	}
	
}
