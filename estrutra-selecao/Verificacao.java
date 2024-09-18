//Solicite um número ao usuário e determine se ele é positivo, negativo ou zero. 

import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = entrada.nextInt();

        if (numero > 0)
            System.out.println("Numero positivo");
        else if (numero < 0)
            System.out.println("Numero negativo");
        else
            System.out.println("Numero zero");

        entrada.close();

    }

}