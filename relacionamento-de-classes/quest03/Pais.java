public class Pais{
    private String nome; 
    private long populacao; 
    private double tamanho;

    public Pais(String nome, long populacao, double tamanho){
        this.nome = nome;
        this.populacao = populacao;
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }

    public long getPopulacao(){
        return populacao;
    }

    public double getTamanho(){
        return tamanho;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPopulacao(int populacao){
        this.populacao = populacao;
    }

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }

}