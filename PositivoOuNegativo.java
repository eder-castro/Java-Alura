//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        System.out.println("Verifica se número é negativo\n");
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um númmero: ");
        numero = leitura.nextInt();
        if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO!");
        } else {
            System.out.println("O número " + numero + " é POSITIVO");
        }
    }
}
