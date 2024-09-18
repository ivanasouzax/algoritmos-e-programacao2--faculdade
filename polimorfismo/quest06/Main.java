/*
  Crie uma classe abstrata Trabalhador com um método abstrato executarTarefa(). 
  Crie subclasses Medico, Engenheiro e Professor que implementam o método executarTarefa(). 
  Crie uma lista de Trabalhador e execute a tarefa de cada trabalhador na lista.
 */

import java.util.ArrayList;

abstract class Trabalhador{
    abstract void executarTarefa();
 }

 class Medico extends Trabalhador{
    @Override
    public void executarTarefa(){
        System.out.println("Executando tarefa de medico");
    }
 }

 class Engenheiro extends Trabalhador{
    @Override
    public void executarTarefa(){
        System.out.println("Executando tarefa de engenheiro");
    }
 }

class Professor extends Trabalhador{
 @Override
    public void executarTarefa(){
        System.out.println("Executando tarefa de professor");
    }
}
public class Main{
    public static void main(String[] args) {
        ArrayList<Trabalhador> trabalhadores = new ArrayList<>();
        trabalhadores.add(new Medico());
        trabalhadores.add(new Engenheiro());
        trabalhadores.add(new Professor());

        for (Trabalhador trabalhador : trabalhadores){
            trabalhador.executarTarefa();
        }

    }
}