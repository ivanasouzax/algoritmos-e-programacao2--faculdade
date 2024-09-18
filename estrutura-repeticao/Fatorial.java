import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para calcular o fatorial");
        double x = entrada.nextDouble();
        double f = x;

        while (x > 1) {
            f = f * (x - 1);
            x--;
        }

        System.out.println("O fatoria é = " + f);

        entrada.close();

    }
}