/*
 Crie uma classe abstrata Forma com um método abstrato calcularArea(). 
 Crie subclasses como Circulo, Retangulo e Triangulo que implementam o método calcularArea().

 */

// Classe abstrata Forma
abstract class Forma {
    // Método abstrato para calcular a área
    abstract double calcularArea();
}

// Subclasse Circulo
class Circulo extends Forma {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Getter e Setter para raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

// Subclasse Retangulo
class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método calcularArea
    @Override
    double calcularArea() {
        return largura * altura;
    }

    // Getters e Setters para largura e altura
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

// Subclasse Triangulo
class Triangulo extends Forma {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método calcularArea
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    // Getters e Setters para base e altura
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

// Classe principal para testar os cálculos de área
public class Main {
    public static void main(String[] args) {
        // Criar instâncias das formas
        Forma circulo = new Circulo(5.0);
        Forma retangulo = new Retangulo(4.0, 6.0);
        Forma triangulo = new Triangulo(3.0, 8.0);

        // Calcular e exibir as áreas
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}
