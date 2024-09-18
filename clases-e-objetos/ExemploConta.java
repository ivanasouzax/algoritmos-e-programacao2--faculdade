//Crie uma classe chamada ContaBancaria com os atributos número da conta e saldo. 
//Implemente construtores para inicializar esses atributos e métodos para depositar, sacar e verificar o saldo.

class ContaBancaria {
    private long numero;
    private long saldo;

    public ContaBancaria(long numero, long saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setDepositar(long valor) {
        this.saldo += valor;
    }

    public long getSacar(long valor) {
        if (valor > this.saldo) {
            throw new Error("Saldo insuficientes");
        }

        this.saldo -= valor;

        return valor;
    }

    public long getVerificarSaldo() {
        return this.saldo;
    }
}

public class ExemploConta{
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria (26558, 100);
		System.out.println(conta1.getVerificarSaldo());

        conta1.setDepositar(500);
        System.out.println(conta1.getVerificarSaldo());
	}
}
