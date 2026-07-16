import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        System.out.println("Contagem regressiva:");

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}