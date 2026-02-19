package Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        
	    	int n,s,num;
	    	
	    	System.out.println("Dime un numero: ");
	    	num = sc.nextInt();
	    	
	    	
	    	while (num >0) {
	    		System.out.println("*");
	    		s = num - 1;
	    		while(s>0) {
	    			System.out.println("*");
	    			s = s-1;
	    		}
	    		num--;
	    		System.out.println("");
	    	}
	    }
	}