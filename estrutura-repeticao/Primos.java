import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo maior que 1: ");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            System.out.println("Número inválido. Por favor, insira um número inteiro positivo maior que 1.");
            return;
        }

        boolean ehPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo)
            System.out.println(numero + " é um número primo.");
        else
            System.out.println(numero + " não é um número primo.");

    }
}