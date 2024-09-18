//Solicite ao usuário para inserir uma nota e, com base na nota, classifique-a como aprovado ou reprovado. Considere a nota para aprovação acima de 7 (sete).

import java.util.Scanner;

public class Classifique {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua nota");

        Double nota = entrada.nextDouble();

        if (nota > 7) {
            System.out.println("Aprovado");
        } else
            System.out.println("Reprovado");

        entrada.close();

    }
}