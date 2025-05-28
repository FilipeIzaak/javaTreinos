import java.util.Scanner;

public class muda {
	public static void main(String[]args) {
		int x, y,z;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de X");
		x = scanner.nextInt();
		System.out.println("Digite o valor de Y");
		y = scanner.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("Este é valor da mudança" + x);
		System.out.println("Este é o valor da mudança de y" + y);
		
	}
}
