//Crie uma classe chamada Triângulo com os atributos base e altura. 
//Adicione um construtor e um método para calcular a área do triângulo. Crie 3 objetos e teste os métodos.

class Triangulo{ 

    private double base; 
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base; 
        this.altura = altura; 
    }

    public double CalcularArea(){
        return (base * altura) / 2; 
    }

}

public class ExemploTriangulo{

    public static void main (String [] args){

        Triangulo t1 = new Triangulo (10, 20);

        System.out.printf( "Area = %.2f", t1.CalcularArea());
    }

}