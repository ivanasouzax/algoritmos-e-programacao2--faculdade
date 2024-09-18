public class Jogador{
    private String nome; 
    private int numero;
    private String posicao;

    // Construtor

    public Jogador(String nome, int numero, String posicao){
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

     // Getters e Setters

    public String getNome(){
        return nome;
    }

    public String getPosicao(){
        return posicao;
    }

    public int getNumero() {
        return numero;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome ='" + nome + '\'' +
                ", posicao ='" + posicao + '\'' +
                ", numero =" + numero +
                '}';
    }
}
