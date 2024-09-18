import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para terminar): ");
            numero = entrada.nextInt();
            if (numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        }

    }
}