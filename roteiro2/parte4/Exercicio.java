/*
* Objetivo: Criar um programa de adivinhação em que o usuário tenta adivinhar um número secreto.
* 1. Gere um número secreto aleatório entre 1 e 100.
* Utilize para isso a classe Random do Java (java.util.Random):
* Random random = new Random();
* int numeroSecreto = random.nextInt(bound:100) + 1;
* 2. Peça ao usuário para adivinhar o número.
* 3. Use um loop while para repetir até o usuário acertar.
* 4. Dentro do loop, use o comando if para verificar se o palpite é correto, alto ou baixo.
* 5. Forneça feedback ao usuário sobre o palpite, indique se o palpite é maior ou menor que o número secreto.
* 6. Quando o usuário acertar, termine o loop.
*/

package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Adivinhe o número secreto entre 1 e 100: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int palpite = scanner.nextInt();

            while (palpite != numeroSecreto) {
                if (palpite > numeroSecreto) {
                    System.out.println("Palpite alto!");
                } else {
                    System.out.println("Palpite baixo!");
                }
                System.out.println("Adivinhe o número secreto entre 1 e 100: ");
                palpite = scanner.nextInt();
            }

            System.out.println("Parabéns, você acertou!");
        }

    }
}
