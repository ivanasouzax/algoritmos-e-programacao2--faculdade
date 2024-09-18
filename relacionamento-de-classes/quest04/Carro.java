public class Carro {
    private Pneus pneus;
    private Motor motor;
    private Bancos bancos; 

    public Carro(Pneus pneus, Motor motor, Bancos bancos){
        this.pneus = pneus;
        this.motor = motor;
        this.bancos = bancos; 
    }

    public double getPrecoTotal() {
        return pneus.getPreco() + motor.getPreco() + bancos.getPreco();
    }

    public void printDetalhes() {
        System.out.println("Preço total do carro: R$ " + getPrecoTotal());
        System.out.println("Detalhes dos componentes:");
        System.out.println("Pneus - Tipo: " + pneus.getTipo() + ", Fabricante: " + pneus.getFabricante() + ", Preço: R$ " + pneus.getPreco());
        System.out.println("Motor - Potência: " + motor.getPotencia() + " HP, Fabricante: " + motor.getFabricante() + ", Preço: R$ " + motor.getPreco());
        System.out.println("Bancos - Modelo: " + bancos.getModelo() + ", Fabricante: " + bancos.getFabricante() + ", Preço: R$ " + bancos.getPreco());
    }

}
