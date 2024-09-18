
import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita uma palavra");

        String palavra = entrada.nextLine(); //Entrada da palavra pelo usuario 

        int numero = palavra.length(); //calcula o comprimento da palavra inserida pelo usuário usando o método length() da classe String, e atribui esse valor à variável inteiro

        System.out.println(numero); //Imprime o numero de caracteres da palavra 

        entrada.close();

    }
}