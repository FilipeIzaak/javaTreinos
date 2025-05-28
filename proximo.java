import java.util.Scanner;

public class proximo {
	public static void main(String[]args) {
		int x, i;
		int somador, negador;
		int n, s;
		s = n = 0;
		Scanner scanner = new Scanner(System.in);
		x = somador = negador = i = 0;
		
		while(i < 12) {
			System.out.println("Digite o valor do " + (i + 1) + "º valor");

			x = scanner.nextInt();
			
			if(x >= 0) {
				System.out.println("Este valor é positivo");
				somador = somador + x;
				s++;
				
			} else  {
				System.out.println("Este número é negativo");
				negador = negador + x;
				n++;
			}
			i++;
		};
		System.out.println("Este é a soma de todos os positivos" + somador);
		System.out.println("Esse são quantas vezes foram inseridos números positivos"+ s);
		System.out.println("Esta é a soma de todos os negativos" + negador);
		System.out.println("Este é tanto de vezes que foram pedidos números negativos"+ n);
		
	}
}
