import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira uma frase:");

        String frase = entrada.nextLine();

        int count = 0; // Esta variável será usada para contar o número de vogais na frase.

        // Converte a string em uma matriz de caracteres, e o loop for itera sobre cada
        // caractere, atribuindo-o à variável

        for (char ch : frase.toCharArray()) {
            if ("aeiou".contains(String.valueOf(ch).toLowerCase())) { // String.valueOf(ch) converte o caractere em uma
                                                                      // string, e .toLowerCase() é usado para garantir
                                                                      // que a comparação seja insensível a
                                                                      // maiúsculas/minúsculas.
                count++;
            }

        }

        System.out.println("O total de vogais = " + count);

        entrada.close();

    }
}