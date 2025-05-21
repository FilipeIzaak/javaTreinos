import java.util.Scanner;

public class Ativ3Lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pessoas = new int[6];
        float acumulador = 0;

        System.out.println("Carregue o vetor:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Insira a altura da %dª pessoa: ", i + 1);
            pessoas[i] = scanner.nextInt();
        }

        System.out.println("Alturas inseridas:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d | ", pessoas[i]);
        }

        for (int i = 0; i < 6; i++) {
            acumulador += pessoas[i];
        }

        System.out.printf("\nSoma das alturas: %.2f\n", acumulador);
        float media = acumulador / 6;
        System.out.printf("Esta é a média das alturas das pessoas: %.2f\n", media);

        scanner.close();
    }
}
