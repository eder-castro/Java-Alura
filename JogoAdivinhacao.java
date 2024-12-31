import java.util.Random;
import java.util.Scanner;

//
public class JogoAdivinhacao {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = new Random().nextInt(10);
        int cont = 0;
        int palpite = 20;
        System.out.println("---------- JOGO DA ADIVINHAÇÃO ----------");
        System.out.println("Você tem 3 chances para adivinhar o número secreto! Vamos lá?");
        while (numero != palpite && cont < 3) {
            System.out.println("Qual o número secreto? (inteiro entre 0 e 10)");
            palpite = leitor.nextInt();
            cont++;
            if (numero == palpite) {
                break;
            }
            if (palpite > numero) {
                System.out.println("O número secreto é MENOR! ");
            } else {
                System.out.println("O número secreto é MAIOR!");
            }
        }
        if (numero == palpite) {
            System.out.println("Parabéns, você acertou! O número é " + numero + " !");
        } else {
            System.out.println(
                    "Você não conseguiu acertar em 3 tentativas! O número era " + numero + " Tente novamente!");
        }
    }
}