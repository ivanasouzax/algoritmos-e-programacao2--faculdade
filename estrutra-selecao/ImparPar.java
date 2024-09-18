//Solicite um número ao usuário e determine se é par ou ímpar.

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = entrada.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        entrada.close();
    }
}