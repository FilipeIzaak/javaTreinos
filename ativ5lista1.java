import java.util.Scanner;

public class ativ5lista1 {

	public static void main(String [] args) {
		
		int num;
		
		num = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu número");
		num = scanner.nextInt();
		
		int metade = num / 2;
		int dobro = metade * 2;
		
		if (dobro == num) {
			System.out.println("Seu numero é par");
		} else {
			System.out.println("Seu numero é impar");
		}
		
	}
}
