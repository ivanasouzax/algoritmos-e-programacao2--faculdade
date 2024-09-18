public class Main {
    public static void main(String[] args) {
        Continente americaDoSul = new Continente("América do Sul");

        Pais brasil = new Pais("Brasil", 8515767, 211000000);
        Pais argentina = new Pais("Argentina", 2780400, 45000000);
        Pais colombia = new Pais("Colômbia", 1141748, 50882891);

        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(colombia);

        System.out.println("Dimensão total do continente: " + americaDoSul.getDimensaoTotal() + " km²");
        System.out.println("População total do continente: " + americaDoSul.getPopulacaoTotal() + " habitantes");
        System.out.println("Densidade populacional do continente: " + americaDoSul.getDensidadePopulacional() + " hab/km²");
        System.out.println("País com maior população: " + americaDoSul.getPaisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + americaDoSul.getPaisComMenorPopulacao().getNome());
    } 
}
