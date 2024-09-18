// Crie uma classe chamada Carro com os atributos marca, modelo e ano de fabricação. 
//Implemente construtores para inicializar esses atributos e métodos para exibir as informações do carro

class Carro{

    private String marca; 
    private String modelo; 
    private int ano;

    public Carro (String marca, String modelo, int ano){
        this.marca = marca; 
        this.modelo = modelo; 
        this.ano = ano; 
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo; 
    }

    public int getAno(){
        return ano; 
    }

}

public class ExemploCarro{ 

    public static void main (String [] args){

        Carro c1 = new Carro ("Uno", "S20", 2018);
        System.out.println("Marca :" + c1.getMarca());
        System.out.println("Modelo : " + c1.getModelo());
        System.err.println("Ano : " + c1.getAno());
    }
}