public class Motor {
    private double preco;
    private double potencia; 
    private String fabricante;

    public Motor(double preco, double potencia, String fabricante){
        this.preco = preco;
        this.potencia = potencia;
        this.fabricante = fabricante;
    }

    public double getPreco(){
        return preco;
    }

    public double getPotencia(){
        return potencia;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
}
