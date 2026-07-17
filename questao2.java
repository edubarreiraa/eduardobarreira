import java.util.Scanner;

public class questao2 {

    public static void maiorEMenor(int[] vetor) {

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

        }

        maiorEMenor(numeros);

        scanner.close();
    }
}