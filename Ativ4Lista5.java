import java.util.Scanner;

public class Ativ4Lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] precos = new float[30];
        int i = 0;

        System.out.println("Digite números de 1 a 30, ou 0 para sair");

        while (i < 30) {
            System.out.printf("Digite o %dº número: ", i + 1);
            float entrada = scanner.nextFloat();

            if (entrada == 0) {
                System.out.println("Encerrando operação");
                break;
            }

            if (entrada >= 1 && entrada <= 30) {
                System.out.println("Número contabilizado");
                precos[i] = entrada;
                i++;
            } else {
                System.out.println("Número inválido");
            }
        }

        System.out.println("\nValores armazenados:");
        for (int j = 0; j < i; j++) {
            System.out.printf("%.2f | ", precos[j]);
        }

        scanner.close();
    }
}
