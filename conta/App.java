import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        // Criando duas contas bancárias para demonstração
        ContaBancaria conta1 = new ContaBancaria("123456", new BigDecimal("1000"), "senha123");
        ContaBancaria conta2 = new ContaBancaria("654321", new BigDecimal("2000"), "senha456");

        // Demonstrando funcionalidades das contas
        ATM atm1 = new ATM(conta1);
        atm1.iniciarSessao(); // Inicia sessão na conta 1 através do ATM

        // Demonstrando transferência de dinheiro entre contas
        ATM atm2 = new ATM(conta2);
        atm2.iniciarSessao(); // Inicia sessão na conta 2 através do ATM
        atm2.transferirDinheiro(conta1, new BigDecimal("500")); // Transfere 500 da conta 2 para a conta 1
    }
}
