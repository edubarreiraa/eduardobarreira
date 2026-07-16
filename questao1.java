import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int contador = 1;
        
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        do {

            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;

        } while (contador <= 10);

        scanner.close();
    }
}