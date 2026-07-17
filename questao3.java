import java.util.Scanner;

public class questao3 {

    // Calcula o desconto
    public static double calcularDesconto(double valorCompra) {

        if (valorCompra > 200) {
            return valorCompra * 0.10;
        } else if (valorCompra > 100) {
            return valorCompra * 0.05;
        }

        return 0;
    }

    // Calcula o frete
    public static double calcularFrete(int quantidadeItens, boolean vip) {

        if (vip) {
            return 0;
        }

        if (quantidadeItens <= 5) {
            return 10;
        }

        return 20;
    }

    // Calcula o valor final
    public static double calcularValorFinal(double valorCompra, double desconto, double frete) {

        return valorCompra - desconto + frete;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Quantidade de itens: ");
        int quantidadeItens = scanner.nextInt();

        System.out.print("Cliente VIP (true/false): ");
        boolean vip = scanner.nextBoolean();

        double desconto = calcularDesconto(valorCompra);

        double frete = calcularFrete(quantidadeItens, vip);

        double valorFinal = calcularValorFinal(valorCompra, desconto, frete);

        System.out.printf("\nValor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Frete: R$ %.2f%n", frete);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}