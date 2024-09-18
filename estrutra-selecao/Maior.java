//Peça ao usuário para inserir dois números e determine qual deles é o maior. 

import java.util.Scanner;

public class Maior {
    public static void main (String []args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite dois numeros");
        int n1 = entrada.nextInt(); 
        int n2 = entrada.nextInt(); 

        if (n1 > n2){
            System.out.println("O numero " + n1 + "e maior");
        }else
            System.out.println("O numero " + n2 + "e maior");
        
        entrada.close();
    }
}