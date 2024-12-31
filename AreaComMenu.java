//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
//Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada...

import java.util.Scanner;

public class AreaComMenu {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println("\nApresenta um menu e calcula a área!\n");
        System.out.println("*********** Escolha uma opção ***********");
        System.out.println("**                                     **");
        System.out.println("**   [1] Calcular área do quadrado     **");
        System.out.println("**                                     **");
        System.out.println("**   [2] Calcular área do círculo      **");
        System.out.println("**                                     **");
        System.out.println("**   [3] SAIR                          **");
        System.out.println("**                                     **");
        System.out.println("*****************************************");
        while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Digite uma opção válida: ");
            opcao = entrada.nextInt();
        }
        double pi = 3.14159;
        System.out.println("Você escolheu a opção " + opcao);
        if (opcao == 3) {
            System.out.println("Programa encerrado!");
        } else if (opcao == 1) {
            System.out.println("Vamos calcular a área de um quadrado. Digite a medido do lado do quadrado: ");
            double lado = entrada.nextDouble();
            double area = lado * lado;
            System.out.println("A área de um quadrado de lado " + lado + " é igual a " + area + " !!!");
        } else {
            System.out.println("Vamos calcular a área de um círculo. Digite o raio: ");
            double raio = entrada.nextDouble();
            double area = pi * raio * raio;
            String mensagem = String.format("A área de um circulo de raio %.2f é igual a %.2f !!!", raio, area);
            System.out.println(mensagem);
        }
    }
}
