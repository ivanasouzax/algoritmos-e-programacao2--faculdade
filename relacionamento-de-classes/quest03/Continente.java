import java.util.ArrayList;

public class Continente {
    private String nome; 
    private ArrayList<Pais> paises; 
    
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<Pais>();
    }

     // Getters e Setters

    public String getNome() {
        return nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
    
    @Override
    public String toString() {
        return "Continente{" + "nome=" + nome + ", paises=" + paises + '}';
    }
    

        // Método para adicionar um país ao continente
        public void adicionarPais(Pais pais) {
            this.paises.add(pais);
        }

        // Método que retorna a dimensão total do continente
        public double getDimensaoTotal() {
            double dimensaoTotal = 0;
            for (Pais pais : paises) {
                dimensaoTotal += pais.getTamanho();
            }
            return dimensaoTotal;
        }
    
        // Método que retorna a população total do continente
        public long getPopulacaoTotal() {
            long populacaoTotal = 0;
            for (Pais pais : paises) {
                populacaoTotal += pais.getPopulacao();
            }
            return populacaoTotal;
        }
    
        // Método que retorna a densidade populacional do continente
        public double getDensidadePopulacional() {
            double dimensaoTotal = getDimensaoTotal();
            long populacaoTotal = getPopulacaoTotal();
            return (dimensaoTotal > 0) ? (double) populacaoTotal / dimensaoTotal : 0;
        }
    
        // Método que retorna o país com maior população no continente
        public Pais getPaisComMaiorPopulacao() {
            if (paises.isEmpty()) return null;
            Pais paisMaiorPopulacao = paises.get(0);
            for (Pais pais : paises) {
                if (pais.getPopulacao() > paisMaiorPopulacao.getPopulacao()) {
                    paisMaiorPopulacao = pais;
                }
            }
            return paisMaiorPopulacao;
        }
    
        // Método que retorna o país com menor população no continente
        public Pais getPaisComMenorPopulacao() {
            if (paises.isEmpty()) return null;
            Pais paisMenorPopulacao = paises.get(0);
            for (Pais pais : paises) {
                if (pais.getPopulacao() < paisMenorPopulacao.getPopulacao()) {
                    paisMenorPopulacao = pais;
                }
            }
            return paisMenorPopulacao;
        }
    }

