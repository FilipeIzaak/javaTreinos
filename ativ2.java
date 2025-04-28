import java.util.Scanner;


public class ativ2 {

	public static void main(String [] main) {
		double pi = 3.1416;
		double raio;
		float resultado;
		Scanner scanner = new Scanner(System.in);
		
		raio = 0;
		resultado = 0;
		
		System.out.println("Insira o raio! ");
		raio = scanner.nextDouble();
		
		
		resultado = (float) (2 * pi * raio);
		
		System.out.println("Esta é a circunferência " + resultado);
	}
}
