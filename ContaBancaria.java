import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        // Variáveis
        String divisoria = "*****************************************";
        double saldo = 2500;
        int opcao = 0;
        String textoSaldo = String.format("Saldo Inicial:     R$ %.2f", saldo);

        // Cabeçalho
        System.out.println(divisoria);
        System.out.println("Dados do Cliente:\n");
        System.out.println("Nome:              Eder Martins de Castro");
        System.out.println("Tipo de Conta:     Corente");
        System.out.println(textoSaldo);
        System.out.println(divisoria);

        // Aplicação
        while (opcao != 4) {
            // Menu
            System.out.println("\n*************** Operações ***************");
            System.out.println("**                                     **");
            System.out.println("**   [1] Consulta Saldo                **");
            System.out.println("**                                     **");
            System.out.println("**   [2] Depósito                      **");
            System.out.println("**                                     **");
            System.out.println("**   [3] Saque                         **");
            System.out.println("**                                     **");
            System.out.println("**   [4] SAIR                          **");
            System.out.println("**                                     **");
            System.out.println(divisoria);

            System.out.println("\nDigite a operação desejada: ");
            opcao = entrada.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.println("OPÇÃO INVÁLIDA\n");
            } else if (opcao == 4) {
                System.out.println("Programa encerrado");
            } else if (opcao == 1) {
                System.out.println(saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a depositar: ");
                double deposito = entrada.nextDouble();
                saldo += deposito;
                System.out.println("Saldo Atual:     R$ " + saldo);
            } else {
                System.out.println("Digite o valor da retirada: ");
                double retirada = entrada.nextDouble();
                if (retirada > saldo) {
                    System.out.println("Seu saldo não é sufuciente para fazer esta retirada!");
                    System.out.println("Saldo Atual:     R$ " + saldo);
                } else {
                    saldo -= retirada;
                    System.out.println("Saldo Atual:     R$ " + saldo);
                }
            }
        }
    }
}
