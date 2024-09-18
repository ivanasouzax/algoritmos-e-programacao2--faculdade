//Crie uma classe chamada Produto com os atributos nome, preço e quantidade em estoque. 
//Implemente métodos para calcular o valor total em estoque desse produto e para adicionar e remover unidades do estoque

class Produto{

    private String nome; 
    private double preco;
    private int quantidade; 
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome; 
        this.preco = preco; 
        this.quantidade = quantidade; 
    }

    public String getNome(){
        return nome; 
    }

    public double getPreco(){
        return preco; 
    }

    public int getQuantidade(){
        return quantidade; 
    }

    public double CalculaTotal(){
        return preco * quantidade; 
    }

    public void AdicionarProduto(int quantidade){
        this.quantidade += quantidade;   
    }

    public void RemoverProduto(int quantidade){
        this.quantidade -= quantidade;
        this.quantidade = Math.max(0, this.quantidade);
    }

}

public class ExemploProduto{

    public static void main (String [] args){

        Produto p1 = new Produto ("Sabonete ", 5.50 , 10);

        p1.AdicionarProduto(50);

        System.out.printf ( "R$ %.2f \n", p1.CalculaTotal());

        System.out.println("Quantidade : " + p1.getQuantidade());

        p1.RemoverProduto(10);

        System.out.println(p1.getQuantidade());
        System.out.printf ( "R$ %.2f \n", p1.CalculaTotal());

    }
}