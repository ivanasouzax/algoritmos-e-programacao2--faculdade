import java.math.BigDecimal;

 class ContaBancaria {
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
    public void sacar(BigDecimal valor, String senhaDigitada) {
        if (senhaDigitada.equals(senha)) {
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
    public void transferir(ContaBancaria outraConta, BigDecimal valor, String senhaDigitada) {
        if (senhaDigitada.equals(senha)) {
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

import java.math.BigDecimal;
import java.util.Scanner;

public class ATM {
    private ContaBancaria conta;

    public ATM(ContaBancaria conta) {
        this.conta = conta;
    }

    public void iniciarSessao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (conta.validarSenha(senha)) {
            exibirMenu();
        } else {
            System.out.println("Senha incorreta. Sessão encerrada.");
        }
    }

    private void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Verificar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Encerrar sessão");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + conta.verificarSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    BigDecimal valorSaque = scanner.nextBigDecimal();
                    conta.sacar(valorSaque, conta.validarSenha("senha"));
                    break;
                case 4:
                    System.out.print("Digite o número da conta para transferir: ");
                    String numeroContaDestino = scanner.next();
                    System.out.print("Digite o valor para transferir: ");
                    BigDecimal valorTransferencia = scanner.nextBigDecimal();
                    ContaBancaria contaDestino = new ContaBancaria(numeroContaDestino, BigDecimal.ZERO, "");
                    conta.transferir(contaDestino, valorTransferencia, conta.validarSenha("senha"));
                    break;
                case 5:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}

public class AppContaBancaria {
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