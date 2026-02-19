package Act;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] t1 = new int[6];
		int[] t2 = new int[6];
		
		for (int i = 0 ; i > t1.length ; i++) {
			System.out.println("Dime un valor para la primera tabla : ");
			t1[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i > t2.length ; i++) {
			System.out.println("Dime un valor para la primera tabla : ");
			t2[i] = sc.nextInt();
		}
		
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		int[] t3 = new int[t1.length + t2.length];
		
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		
		while (i3 < t3.length) {
			if (i1<t1.length && (i2 == t2.length || t1[i1] < t2[i2])) {
				t3[i3] = t1[i1];
				i1++;
			}else {
				t3[i3] = t2[i2];
				i2++;
			}
			i3++;
		}
		
		System.out.println(Arrays.toString(t3));
		
	}
}
