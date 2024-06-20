import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa = 0;
        boolean adivinhou = false;

        System.out.println("Seja bem vindo ao jogo");
        System.out.println("Adivinhe o número entre 1 e 100");

        while (!adivinhou) {
            System.out.println("Digite seu palpite:");
            int palpite = ler.nextInt();
            tentativa++;

            if (palpite == numeroAleatorio) {
                adivinhou = true;
                System.out.println("Parabéns, você acertou o número em " + tentativa + " tentativas!");
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else {
                System.out.println("O número é menor. Tente novamente.");
            }
        }

    }
}

