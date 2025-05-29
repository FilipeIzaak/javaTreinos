// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class ativvv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int fatorial = 1;

        System.out.println("Digite o número que você quer:");
        num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }

        System.out.println(" = " + fatorial);
        scanner.close();
    }
}
