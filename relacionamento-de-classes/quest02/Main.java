public class Main {
        public static void main(String[] args) {

            Jogador jogador1 = new Jogador("Ronaldo", 9 , "Atacante");
            Jogador jogador2 = new Jogador("Cafu", 2 ,"Defensor");
            Jogador jogador3 = new Jogador("Ronaldinho", 10 , "Meio-campo");
    
            // Criar um time
            Time time1 = new Time("Brasil");
    
            // Adicionar jogadores ao time
            time1.adicionarJogador(jogador1);
            time1.adicionarJogador(jogador2);
            time1.adicionarJogador(jogador3);
    
            // Listar jogadores do time
            time1.listarJogadores();
        }
    }