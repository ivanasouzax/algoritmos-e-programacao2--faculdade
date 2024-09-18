public class Branco{
    public static void main(String[] args) {
        String input = "   Ola,   mundo!   ";
        String resultado = removerEspacos(input);
        System.out.println("String original: \"" + input + "\"");
        System.out.println("String sem espaços em branco: \"" + resultado + "\"");
    }

    public static String removerEspacos(String input) {
        // Substitui todos os espaços em branco (\s) por uma string vazia
        return input.replaceAll("\\s", "");
    }
}
