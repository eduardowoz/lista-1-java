import java.util.Scanner;


public class Main3{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o numero da conta: ");
        String numeroconta = leitor.nextLine();

        System.out.println("Informe o nome do usuario: ");
        String nometitular = leitor.nextLine();

        ContaBancaria minhaConta = new ContaBancaria(numeroconta, nometitular); 

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Sair");

        boolean sair = false;

        while (!sair) {
            System.out.print("Opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um valor para depositar: ");
                    double valorDeposito = leitor.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    double valorSaque = leitor.nextDouble();
                    if (minhaConta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + minhaConta.consultarSaldo());
                    break;
                case 4:
                    sair = true;
                    System.out.println("Obrigado por utilizar o sistema bancário!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        leitor.close();
    }
}