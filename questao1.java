import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[8];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do participante " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome que deseja pesquisar: ");
        String busca = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i].equalsIgnoreCase(busca)) {
                contador++;
            }

        }

        System.out.println("O nome \"" + busca + "\" aparece " + contador + " vez(es).");

        scanner.close();
    }
}