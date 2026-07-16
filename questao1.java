import java.util.Scanner;
public class questao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double altura;
        double soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite a altura do aluno " + i + ": ");
            altura = scanner.nextDouble();

            soma += altura;
        }

        media = soma / 5;

        System.out.printf("Média das alturas = %.2f%n", media);

        scanner.close();
    }
}