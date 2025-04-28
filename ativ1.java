import java.util.Scanner;

public class ativ1 {

	public static void main(String [] args) {
		
		int largura, comprimento;
		double resultado;
		Scanner scanner = new Scanner(System.in);
		
		resultado = 0.0;
		
		
		System.out.println("Qual será a largura? ");
		largura = scanner.nextInt();
		
		System.out.println("Quaç será o comprimento");
		comprimento = scanner.nextInt();
		
		resultado = largura * comprimento;
		
		System.out.println("Está é a área do retângulo " + resultado);
		
		scanner.close();
	}
}
