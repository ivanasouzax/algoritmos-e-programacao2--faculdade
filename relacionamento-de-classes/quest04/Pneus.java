public class Pneus{
    private double preco;
    private String tipo; 
    private String fabricante;

    public Pneus(double preco, String tipo, String fabricante){
        this.preco = preco;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public double getPreco(){
        return preco;
    }

    public String getTipo(){
        return tipo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante; 
    }

}