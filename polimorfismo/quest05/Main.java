/*
 Crie uma classe abstrata Jogo com um método abstrato iniciar(). 
 Crie subclasses JogoDeTabuleiro, Videogame e JogoDeCartas que implementam o método `iniciar()`.  
 Crie uma lista de Jogo e inicie cada jogo na lista.

 */

import java.util.ArrayList;

abstract class Jogo{
    abstract void iniciar();
}

class JogoDeTabuleiro extends Jogo{
    @Override
    public void iniciar(){
        System.out.println("O jogo de tabuleiro foi iniciado");
    }
}

class Videogame extends Jogo{
    @Override
    public void iniciar(){
        System.out.println("O video game foi iniciado");
    }
}

class JogoDeCartas extends Jogo{
    @Override
    public void iniciar(){
        System.out.println("O jogo de cartas foi iniciado");
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Jogo> jogos = new ArrayList<>();
        jogos.add(new JogoDeTabuleiro());
        jogos.add(new Videogame());
        jogos.add(new JogoDeCartas());

        for (Jogo jogo : jogos){
            jogo.iniciar();
        }
    }
}
