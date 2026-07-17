import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("Digite os valores da matriz:");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print("Posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

            }

        }

        System.out.println("\nValores pares encontrados:");

        for (int linha = 0; linha < 2; linha++) {

            for (int coluna = 0; coluna < 2; coluna++) {

                if (matriz[linha][coluna] % 2 == 0) {

                    System.out.println(
                        "Valor: " + matriz[linha][coluna] +
                        " | Posição: [" + linha + "][" + coluna + "]"
                    );

                }

            }

        }

        scanner.close();
    }
}