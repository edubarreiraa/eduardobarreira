import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[5];

        System.out.println("Digite os valores do primeiro vetor:");

        for (int i = 0; i < 5; i++) {

            System.out.print("Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();

        }

        System.out.println("\nDigite os valores do segundo vetor:");

        for (int i = 0; i < 5; i++) {

            System.out.print("Posição " + i + ": ");
            vetor2[i] = scanner.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nVetor Resultante:");

        for (int i = 0; i < 5; i++) {
            System.out.println(vetor3[i]);
        }

        scanner.close();
    }
}