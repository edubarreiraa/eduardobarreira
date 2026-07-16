import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Digite a quantidade de termos: ");
        n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo;

        for (int i = 1; i <= n; i++) {

            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}