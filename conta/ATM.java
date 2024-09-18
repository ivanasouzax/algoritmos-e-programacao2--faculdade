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

        scanner.close();
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
                    conta.sacar(valorSaque, "senha");
                    break;
                case 4:
                    System.out.print("Digite o número da conta para transferir: ");
                    String numeroContaDestino = scanner.next();
                    System.out.print("Digite o valor para transferir: ");
                    BigDecimal valorTransferencia = scanner.nextBigDecimal();
                    ContaBancaria contaDestino = new ContaBancaria(numeroContaDestino, BigDecimal.ZERO, "");
                    conta.transferir(contaDestino, valorTransferencia, "senha");
                    break;
                case 5:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public void transferirDinheiro(ContaBancaria conta1, BigDecimal bigDecimal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferirDinheiro'");
}

}
