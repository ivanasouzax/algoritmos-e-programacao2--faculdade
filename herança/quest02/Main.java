/*
Crie uma classe Veículo com atributos como marca, modelo e ano.
Crie subclasses como Carro e Caminhao que adicionam atributos específicos,
como numeroDePortas para Carro e capacidadeDeCarga para Caminhao.

*/

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    public int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de portas: " + numeroDePortas);
    }

}

class Caminhao extends Veiculo {
    public int capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga){
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidade de carga: " + capacidadeDeCarga);
    }

}

public class Main{
    public static void main(String[] args) {
        Carro carro1= new Carro("Fiat", "Uno", 2020, 4);
        Caminhao caminhao1 = new Caminhao("Volvo", "F60", 2020, 1000);

        carro1.mostrarInfo();
        caminhao1.mostrarInfo();
 }
}