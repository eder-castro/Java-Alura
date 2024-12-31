//Peça ao usuário para inserir dois números inteiros.
//Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior...

import java.util.Scanner;

public class ComparaInteiros {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int num1, num2 = 0;
        System.out.println("Comparando 2 números!\n");
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();
        if (num1 == num2) {
            System.out.println("Os números " + num1 + " e " + num2 + " são IGUAIS!!!");
        } else if (num1 > num2) {
            System.out.println("O número " + num1 + " é MAIOR que o número " + num2 + " !!!");
        } else {
            System.out.println("O número " + num1 + " é MENOR que o número " + num2 + " !!!");
        }
    }
}
