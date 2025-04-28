import java.util.Scanner;

public class ativ3 {
	public static void main(String [] args) {
		int altura, base;
		float resultado;
		Scanner scanner = new Scanner(System.in);
		
		altura = 0;
		base = 0;
		resultado = 0;
		
		System.out.println("Digite a altura");
		altura = scanner.nextInt();
		
		System.out.println("Digite a base");
		base = scanner.nextInt();
		
		resultado = (float) ((base * altura)/2);
		
		System.out.println("Essa é a área do seu triângulo" + resultado);
		
		scanner.close();
	}
}
