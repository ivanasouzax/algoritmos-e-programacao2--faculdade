
//Faça um programa que verifique se uma string é um palíndromo,
// ou seja, se ela é a mesma quando lida de trás para frente. Por exemplo, "radar" é um palíndromo.
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra");

        String palavra = entrada.nextLine();

        // Remover espaços em branco e converter para minúsculas para ignorar
        // maiúsculas/minúsculas
        String clean = palavra.replaceAll("\\s+", "").toLowerCase();

        boolean ehPalindromo = true;

        // Este é um loop for que itera sobre metade do comprimento da palavra inserida
        // pelo usuário
        for (int i = 0; i < clean.toCharArray().length / 2; i++) {

            /// Dentro do loop, o programa verifica se o caractere na posição i da palavra
            /// não é igual ao caractere na posição oposta
            if (clean.charAt(i) != clean.charAt(clean.toCharArray().length - 1 - i)) {
                ehPalindromo = false;
                break;
            }

        }

        System.out.println(clean + " " + ehPalindromo); 
        
        entrada.close();
    }
}