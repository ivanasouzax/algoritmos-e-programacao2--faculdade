import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        int next = n1 + n2;

        System.out.format("Série de Fibonacci: %d, %d, ", n1, n2);
        for (int i = 3; i <= 10; ++i) {
            System.out.print(next);
            if (i != 10) {
                System.out.print(", ");
            }
            n1 = n2;
            n2 = next;
            next = n1 + n2;
        }
        System.out.println();
    }

}