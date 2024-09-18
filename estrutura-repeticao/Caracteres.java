import java.util.Scanner; 

public class Caracteres{
    public static void main (String []args){
    
    Scanner entrada = new Scanner (System.in); 
    System.out.print("Digite uma frase: ");
    String frase = entrada.nextLine();

    int counter = 0;
    for (char ch : frase.toCharArray()) {
      if(Character.isUpperCase(ch)) {
        counter++;
      }
    }

    System.out.format("Um total de %d letras maiúsculas na frase: %s\n", counter, frase);
  }

}