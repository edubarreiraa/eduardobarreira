import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        if (numero == 0 || numero == 1) {

            fatorial = 1;

        } else {

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        scanner.close();
    }
}