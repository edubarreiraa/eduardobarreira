import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("\nNúmeros pares:");

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }

        }

        scanner.close();
    }
}