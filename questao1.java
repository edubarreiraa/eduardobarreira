import java.util.Scanner;

class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class questao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            produtos[i] = new Produto(nome, preco, quantidade);
        }

        System.out.println("\n===== PRODUTOS CADASTRADOS =====");

        for (Produto produto : produtos) {

            System.out.println("----------------------------");
            System.out.println("Nome: " + produto.nome);
            System.out.printf("Preço: R$ %.2f%n", produto.preco);
            System.out.println("Quantidade: " + produto.quantidade);

        }

        scanner.close();
    }
}