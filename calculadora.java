import java.util.Scanner;

public class calculadora {
	public static void main( String[]args) {
		Scanner scanner = new Scanner(System.in);
		float result;
		float num1, num2;
		String ope;
		
		
		result = num1 = num2 = 0;
		
		System.out.println("Digite qual operação voce quer executar +, +, X, /");
		ope = scanner.nextLine();
		System.out.println("Digite o primeiro valor");
		num1 = scanner.nextFloat();
		System.out.println("DIgite o segundo valor");
		num2 = scanner.nextFloat();
		switch(ope){
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "x" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
		}
		System.out.printf("Este é o resultado "+ result);
	}
}
