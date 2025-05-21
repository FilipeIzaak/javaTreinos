import java.util.Scanner;

public class Ativ1Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Defina qual será o tamanho X do vetor!");
        x = scanner.nextInt();
        System.out.println("Defina o valor do tamanho Y do vetor!");
        y = scanner.nextInt();

        int[][] mat = new int[x][y];

        // Entrada de valores
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Digite o valor [%d] [%d]: ", i, j);
                mat[i][j] = scanner.nextInt();
            }
        }

        // Todos os números
        System.out.println("\nTodos os números:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("[%d][%d] = %d\n", i, j, mat[i][j]);
            }
        }

        // Invertido
        System.out.println("\nInvertido:");
        for (int i = x - 1; i >= 0; i--) {
            for (int j = y - 1; j >= 0; j--) {
                System.out.printf("[%d][%d] = %d\n", i, j, mat[i][j]);
            }
        }

        // Números pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mat[i][j] % 2 == 0) {
                    System.out.printf("[%d][%d] = %d\n", i, j, mat[i][j]);
                }
            }
        }

        // Números ímpares
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mat[i][j] % 2 != 0) {
                    System.out.printf("[%d][%d] = %d\n", i, j, mat[i][j]);
                }
            }
        }

        scanner.close();
    }
}
