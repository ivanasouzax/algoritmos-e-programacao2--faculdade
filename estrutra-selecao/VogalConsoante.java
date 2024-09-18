//Solicite ao usuário para inserir uma letra e determine se ela é vogal ou consoante. 

import java.util.Scanner; 

public class VogalConsoante{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra");

        char ch = entrada.nextLine().toCharArray()[0];

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
              System.out.println("Vogal");
              break;
            default:
              System.out.println("Consoante");
              break;
        
    }
    
    entrada.close();
  } 
}