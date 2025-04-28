import java.util.Scanner;

public class ativ4lista1 {

	
	public static void main(String [] args) {
		int x, y, z;
		
		x = y = z = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("informe um numero");
		 x = scanner.nextInt();
		
		System.out.println("Informe mais um número");
		 y = scanner.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("Este é o valor de x " + x);
		System.out.println("Este é o valor de y" + y);
		
	}
}
