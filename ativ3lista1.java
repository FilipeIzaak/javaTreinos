import java.util.Scanner;

public class ativ3lista1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual sua altura");
		idade = scanner.nextInt();
		
		if(idade < 2) {
			System.out.println("VOce é um bebe");
			
		}else if(idade > 3 && idade < 10) {
			System.out.println("VOce é uma crinaça");
			
		}else if(idade > 11 &&30 idade < 19) {
			System.out.println("VOce é um adolencente");
			
		}else {
			System.out.println("VOce é um adulto");
		}
		
	}
}
