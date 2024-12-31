//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10...

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        System.out.println("\nExibe a tabuada de um número\n");
        System.out.println("Digite um número para exibir sua tabuada: ");
        num = entrada.nextInt();
        String bordaE = "||   ";
        String bordaD = "   ||";
        String vezes = "  x  ";
        String igual = "  =  ";
        int base = 0;
        int res = 0;
        String linha = "%s %4d %s %d %s %4d %s";
        String pula = "%s                         %s";
        System.out.println("\n******* TABUADA DO NÚMERO " + num + " *******");
        String pulaLinha = String.format(pula, bordaE, bordaD);
        System.out.println(pulaLinha);
        for (int i = 0; i <= 10; i++) {
            String impressao = String.format(linha, bordaE, base, vezes, num, igual, res, bordaD);
            System.out.println(impressao);
            base += 1;
            res = base * num;
        }
        System.out.println(pulaLinha);
        System.out.println("==================================");
    }
}
