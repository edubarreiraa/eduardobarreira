import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        System.out.println("Sequência:");

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}