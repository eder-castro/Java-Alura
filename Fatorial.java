
//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número...
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        int num, fat = 0;
        System.out.println("\nMostra o fatorial do número digitado\n");
        System.out.println("Escolha um número para mostrar seu fatorial!");
        num = entrada.nextInt();
        fat = num;
        for (int i = num - 1; i > 0; i--) {
            fat = fat * i;
        }
        System.out.println("O valor de " + num + "! é " + fat);
    }
}
