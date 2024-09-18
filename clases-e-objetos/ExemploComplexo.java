class Complexo {
    private double parteReal;
    private double parteImaginaria;

    // Construtor sem parâmetros que inicializa o objeto como zero

    public Complexo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    // Construtor com um parâmetro representando a parte real; a parte imaginária
    // será zero

    public Complexo (double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0.0;
    }

    // Construtor com dois parâmetros representando as partes real e imaginária
    public Complexo (double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }


    // Método para obter a parte real do número complexo

    public double getParteReal() {
        return parteReal;
    }

    // Método para obter a parte imaginario do número complexo
    public double getParteImaginaria() {
        return parteImaginaria;
    }

    // Método para calcular o módulo (valor absoluto) do número complexo
    public double CalcularModulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }

    // Método para calcular o ângulo (argumento) do número complexo em radianos
    public double CalcularAngulo() {
        return Math.atan2(parteImaginaria, parteReal);
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    // Método para calcular a soma de dois numeros complexos
    public Complexo soma(Complexo outro) {
        return new Complexo(this.parteReal + outro.parteReal, this.parteImaginaria + outro.parteImaginaria);
    }

    // Método para calcular a subtração de dois numeros complexos
    public Complexo subtracao(Complexo outro) {
        return new Complexo(this.parteReal - outro.parteReal, this.parteImaginaria - outro.parteImaginaria);
    }

    // Método para calcular a multiplicação de dois numeros complexos
    public Complexo multiplicacao(Complexo outro) {
        return new Complexo(this.parteReal * outro.parteReal, this.parteImaginaria * outro.parteImaginaria);
    }

    // Método para calcular a divisao de dois numeros complexos
    public Complexo divisao(Complexo outro) {
        return new Complexo(this.parteReal / outro.parteReal, this.parteImaginaria / outro.parteImaginaria);
    }

    public boolean equals(Complexo outro) {
        return this.parteReal == outro.getParteReal() && this.parteImaginaria == outro.getParteImaginaria();
    }

    // Método toString para converter um número complexo em uma string

    @Override
    //public String toString() {
     //   return String.format("(%.1f,%.1f)", parteReal, parteImaginaria);
    //}

    public String toString() {
        return String.format("%.1f + %.1fi", this.parteReal, this.parteImaginaria);
      }

}

public class ExemploComplexo {

    public static void main(String[] args) {
        Complexo c1 = new Complexo(3.0, 4.0);
        Complexo c2 = new Complexo(1.0, 2.0);

        System.out.println("Número complexo 1: " + c1);
        System.out.println("Número complexo 2: " + c2);

        Complexo soma = c1.soma(c2);
        System.out.println("Soma dos números complexos: " + soma);

        Complexo subtracao = c1.subtracao(c2);
        System.out.println("Subtracao dos números complexos: " + subtracao);

        Complexo multiplicacao = c1.multiplicacao(c2);
        System.out.println("Multiplicacao dos números complexos: " + multiplicacao);

        Complexo divisao = c1.divisao(c2);
        System.out.println("Soma dos números complexos: " + divisao);

        System.out.println("O angulo do numero complexos: " + c1.CalcularAngulo());

        System.out.println("O modulo dos nuemros complexo: " + c1.CalcularModulo());

        System.out.println("Os números complexos são iguais? " + c1.equals(c2));

    }
}