/*
  Crie uma classe abstrata Animal com um método abstrato fazerSom(). 
  Crie subclasses Cachorro, Gato e Vaca que implementam o método fazerSom().
  Crie uma lista de Animal e adicione instâncias dessas subclasses. 
  Percorra a lista chamando fazerSom() em cada elemento para demonstrar o polimorfismo.

 */
import java.util.ArrayList;

 abstract class Animal{
    abstract void fazerSom(); 
 }

 class Cachorro extends Animal{
    @Override
    public void fazerSom(){
       System.out.println("Cachorro faz: Au Au");
    }
 }

 class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Gato faz: Miau Miau");
    }
 }

 class Vaca extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Vaca faz: Muuu");
    }
 }

 public class Main{
    public static void main (String [] args){
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.fazerSom();
        }

    }
 }