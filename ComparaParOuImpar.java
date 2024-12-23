//Crie um programa que solicite ao usuário a entrada de um número inteiro.
//Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class ComparaParOuImpar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int num, res = 0;
        System.out.println("\nVerificando se é par ou ímpar!\n");
        System.out.println("Digite o número: ");
        num = entrada.nextInt();
        res = num % 2;
        if (res > 0) {
            System.out.println("O número " + num + " é ÍMPAR!");
        } else {
            System.out.println("O número " + num + " é PAR!");
        }
    }
}
