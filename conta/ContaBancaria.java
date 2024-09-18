import java.math.BigDecimal;

public class ContaBancaria {
    private String numeroConta;
    private BigDecimal saldo;
    private String senha;

    // Construtor para inicializar número da conta, saldo e senha
    public ContaBancaria(String numeroConta, BigDecimal saldo, String senha) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    // Método para depositar dinheiro na conta
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    // Método para sacar dinheiro da conta
    public void sacar(BigDecimal valor, String b) {
        if (senha.equals(b)) {
            if (saldo.compareTo(valor) >= 0) {
                saldo = saldo.subtract(valor);
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    // Método para verificar saldo da conta
    public BigDecimal verificarSaldo() {
        return saldo;
    }

    // Método para transferir dinheiro para outra conta
    public void transferir(ContaBancaria outraConta, BigDecimal valor, String b) {
        if (senha.equals(b)) {
            if (saldo.compareTo(valor) >= 0) {
                saldo = saldo.subtract(valor);
                outraConta.depositar(valor);
                System.out.println("Transferência de " + valor + " realizada com sucesso para a conta " + outraConta.numeroConta + ".");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    // Método para validar a senha da conta
    public boolean validarSenha(String senhaDigitada) {
        return senhaDigitada.equals(senha);
}
}

