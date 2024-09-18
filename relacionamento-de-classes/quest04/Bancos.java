public class Bancos {
    private double preco;
    private String modelo; 
    private String fabricante;

    public Bancos(double preco, String modelo, String fabricante){
        this.preco = preco;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public double getPreco(){
        return preco;
    }

    public String getModelo(){
        return modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setTipo(String modelo){
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante; 
    }
}
