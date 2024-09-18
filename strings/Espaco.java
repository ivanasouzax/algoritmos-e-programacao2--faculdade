import java.util.Scanner;

public class Espaco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase");

        String texto = entrada.nextLine();
        String textoSemEspacosExtras = texto.replaceAll("\\s+", " ").trim();

        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("Texto sem espaços extras: \"" + textoSemEspacosExtras + "\"");

        entrada.close();
    }
}