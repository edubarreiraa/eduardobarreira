import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> produtos = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o preço do produto " + i + ": ");
            produtos.add(scanner.nextInt());

        }

        System.out.println("\nLista original:");
        System.out.println(produtos);

        produtos.removeIf(valor -> valor < 50);

        Collections.sort(produtos);

        System.out.println("\nLista atualizada:");
        System.out.println(produtos);

        if (!produtos.isEmpty()) {

            int maior = Collections.max(produtos);
            int menor = Collections.min(produtos);

            double soma = 0;

            for (int valor : produtos) {
                soma += valor;
            }

            double media = soma / produtos.size();

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.printf("Média: %.2f%n", media);

        } else {

            System.out.println("Todos os produtos foram removidos.");

        }

        scanner.close();
    }
}