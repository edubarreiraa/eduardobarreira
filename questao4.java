import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

        }

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {

                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;

                }

            }

        }

        System.out.println("\nValores em ordem crescente:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}