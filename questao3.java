import java.util.Scanner;
public class questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();

        } while (numero < 0);

        int divisor = 1;
        int quantidadeDivisores = 0;

        while (divisor <= numero) {
            if (numero % divisor == 0) {
                quantidadeDivisores++;
            }
            divisor++;
        }

        if (quantidadeDivisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();

    }
}