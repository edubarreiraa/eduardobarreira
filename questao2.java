import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] resultado = new int[2][2];

        System.out.println("Digite os valores da primeira matriz:");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print("A[" + linha + "][" + coluna + "]: ");
                matrizA[linha][coluna] = scanner.nextInt();

            }

        }

        System.out.println("\nDigite os valores da segunda matriz:");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print("B[" + linha + "][" + coluna + "]: ");
                matrizB[linha][coluna] = scanner.nextInt();

            }

        }

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                resultado[linha][coluna] = 0;

                for (int k = 0; k < 2; k++) {

                    resultado[linha][coluna] += matrizA[linha][k] * matrizB[k][coluna];

                }

            }

        }

        System.out.println("\nMatriz Resultante:");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print(resultado[linha][coluna] + "\t");

            }

            System.out.println();

        }

        scanner.close();
    }
}