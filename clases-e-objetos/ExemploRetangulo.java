//Crie uma classe chamada Retângulo com os atributos comprimento e largura. 
//Adicione um construtor e um método para calcular a área do retângulo.

class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double CalcularArea() {
        return comprimento * largura;
    }

}

public class ExemploRetangulo {

    public static void main(String[] args) {

        Retangulo area1 = new Retangulo(20, 30);

        System.out.println(area1.CalcularArea());
    }
}