// Classe base Conta
public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

// Subclasse ContaEspecial
class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Limite de saque excedido.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

// Subclasse ContaPoupanca
class ContaPoupanca extends Conta {
    private String dataAniversario;

    public ContaPoupanca(int numero, double saldo, String dataAniversario) {
        super(numero, saldo);
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}

// Classe principal para testar as contas
public class Main {
    public static void main(String[] args) {
        Conta contaNormal = new Conta(123, 0);
        contaNormal.depositar(100);
        contaNormal.sacar(50);

        ContaEspecial contaEspecial = new ContaEspecial(456, 500, 1000);
        contaEspecial.depositar(500);
        contaEspecial.sacar(1500);

        ContaPoupanca contaPoupanca = new ContaPoupanca(789, 1000, "01/01");
        contaPoupanca.sacar(200);
    }
}
