
import java.util.Scanner; 

public class Inversao{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        //Solicitar a entrada do usuario
        System.out.println("Digite uma frase");

        String frase = entrada.nextLine();
        String reverso = ""; //Criar uma string vazia para armazenar a versão final da string revertida.

        //Criar uma laço for, que decrementa ate a ultima letra da string e chegar no 0
        for(int i = frase.length() - 1; i >= 0; i--){
            reverso += frase.charAt(i); // Cada caractere da string é acessado usando o método charAt(i)
        }

        System.out.println("Reverso: " + reverso); // Imprime a frase revertida

        entrada.close();
    }
}

