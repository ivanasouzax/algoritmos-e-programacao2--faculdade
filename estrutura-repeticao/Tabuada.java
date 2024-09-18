//Peça ao usuário para inserir um número e imprima a tabuada desse número de 1 a 10 usando um loop for.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = entrada.nextInt();

        System.out.println("Tabuada da soma:");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "+" + i + "=" + (numero + i));
        }

        System.out.println("Tabuada da subtração:");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "-" + i + "=" + (numero - i));
        }

        System.out.println("Tabuada da multiplição:");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "*" + i + "=" + (numero * i));
        }

        System.out.println("Tabuada da divisão:");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "/" + i + "=" + (numero / i));
        }

    }
}