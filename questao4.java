import java.util.Scanner;
public class questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] depositos = new double[100];

        int quantidade =  0;
        double valor;
        double maior = 0;
        double total = 0;

        String resposta;

        do {

            do {

                System.out.print("Digite o valor do depósito: ");
                valor = scanner.nextDouble();

                if (valor < 0) {
                    System.out.println("Valor inválido. Digite um valor positivo.");
                }

            } while (valor < 0);

            depositos[quantidade] = valor;

            quantidade++;

            System.out.print("Deseja continuar? (S/N): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        int i = 0;

        while (i < quantidade) {
            total += depositos[i];

            if (depositos[i] > maior) {
                maior = depositos[i];
            }

            i++;
        }

        double media = total / quantidade;

        System.out.println("\n===== RELATÓRIO =====");
        System.out.printf("Total depositado: R$ %.2f%n", total);
        System.out.println("Quantidade de depósitos: " + quantidade);
        System.out.printf("Maior depósito: R$ %.2f%n", maior);
        System.out.printf("Média dos depósitos: R$ %.2f%n", media);

        scanner.close();
    }
}