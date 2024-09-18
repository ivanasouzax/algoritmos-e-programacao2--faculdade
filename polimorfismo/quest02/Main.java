/*
 Crie uma classe abstrata Veiculo com um método abstrato mover(). 
 Crie subclasses Carro, Moto e Bicicleta que implementam o método mover().  
 Utilize um array de Veiculo para armazenar diferentes tipos de veículos e chame mover() para cada um.

 */

import java.util.ArrayList;

abstract class Veiculo{
    abstract void mover();
 }

 class Carro extends Veiculo{
    @Override
    public void mover(){
        System.out.println("O carro moveu para frente");
    }
 }

 class Moto extends Veiculo{
    @Override
    public void mover(){
        System.out.println("A moto moveu para frente");
    }
 }

 class Bicicleta extends Veiculo{
    @Override
    public void mover(){
        System.out.println("A bicicleta moveu para frente");
    }
 }

 public class Main{
    public static void main (String [] args){
        ArrayList<Veiculo> veiculos = new ArrayList<>(); 
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Bicicleta());

        for (Veiculo veiculo: veiculos){
            veiculo.mover();
        }
    }
 }