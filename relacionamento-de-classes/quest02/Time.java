import java.util.ArrayList;

public class Time {
    private String nome; 
    private ArrayList<Jogador> jogadores;

    //Constructor

    public Time (String nome){
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

     // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    //Métodos

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador){
        jogadores.remove(jogador);
    }

    public void listarJogadores() {
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome() + "Numero: " + jogador.getNumero() + "Posicao: "+ jogador.getPosicao());
        }

    }
}
