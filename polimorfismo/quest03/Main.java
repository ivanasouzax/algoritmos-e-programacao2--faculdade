/*
 Crie uma classe abstrata Forma com um método abstrato calcularArea(). 
 Crie subclasses Circulo, Retangulo e Triangulo que implementam o método calcularArea(). 
 Crie uma lista de Forma e calcule a área de cada forma na lista.

 */

import java.util.ArrayList; 
abstract class Forma {
    public abstract double calcularArea();
}

class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Círculo com raio " + raio + " tem área: " + calcularArea();
    }
}

class Retangulo extends Forma{
    private double altura; 
    private double largura; 

    public Retangulo(double altura, double largura){
        this.altura = altura; 
        this.largura = largura; 
    }

    public double getAltura(){
        return altura; 
    }

    public double getLargura(){
        return largura; 
    }

    public void setAltura(double altura){
        this.altura = altura; 
    }

    public void setLargura(double largura){
        this.largura = largura; 
    }

    @Override
    public double calcularArea(){
        return altura * largura; 
    }

    @Override
    public String toString(){
        return "Retangulo com area " + calcularArea(); 
    }
}
class Triangulo extends Forma{
    private double base; 
    private double altura; 

    public Triangulo(double base, double altura){
        this.base = base; 
        this.altura = altura; 
    }

    public double getBase(){
        return base; 
    }

    public double getAltura(){
        return altura; 
    }

    public void setBase(double base){
        this.base = base; 
    }

    public void setAltura(double altura){
        this.altura = altura; 
    }

    @Override
    public double calcularArea(){
        return (base * altura ) / 2; 
    }

    @Override
    public String toString(){
        return "Triangulo com area " + calcularArea(); 
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(50));
        formas.add(new Retangulo(10, 20));
        formas.add(new Triangulo(10, 5));

        for (Forma forma : formas){
            System.out.println(forma);
        }
    }
}