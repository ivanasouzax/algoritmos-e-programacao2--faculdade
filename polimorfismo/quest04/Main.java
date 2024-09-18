/*
 Crie uma classe abstrata Eletronico com um método abstrato ligar(). 
 Crie subclasses Televisao, Radio e Computador que implementam o método ligar(). 
 Crie uma lista de Eletronicos ligue cada eletrônico na lista.

 */

import java.util.ArrayList;

abstract class Eletronico{
    abstract void ligar();
 }

 class Televisao extends Eletronico{
    @Override
    public void ligar(){
        System.out.println("A televisão está agora ligada.");
    }
 }

 class Radio extends Eletronico{
    @Override
    public void ligar(){
        System.out.println("O radio agora está ligado.");
    }
 }

 class Computador extends Eletronico{
    @Override
    public void ligar(){
        System.out.println("O computador agora está ligado.");
    }
 }

 public class Main{
    public static void main (String [] args){
        ArrayList<Eletronico> eletronicos = new ArrayList<>(); 
        eletronicos.add(new Televisao());
        eletronicos.add(new Radio());
        eletronicos.add(new Computador());

        for (Eletronico eletronico: eletronicos){
            eletronico.ligar();
        }
    }
 }