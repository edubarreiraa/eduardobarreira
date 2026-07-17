import java.util.Scanner;

public class questao1 {

    public static long calcularFatorial(int numero) {

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + " = " + resultado);

        scanner.close();
    }
}