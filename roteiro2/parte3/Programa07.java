/*
 * 4 – Ainda no mesmo pacote crie a classe Programa07 idêntico ao Programa06, e faça com que o programa apresente a média das notas que foram inseridas.
 * Atenção para o resultado que deve ser apresentado
 * (Exemplo : Se metade das notas inseridas tem o valor 7 e a outra metade tem o valor 8, a média esperada é 7,5).
 */


package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
            
        try (Scanner entrada = new Scanner(System.in)) {
            
            float somaNotas = 0;
            int quantidadeNotas = 0;
        
            while (true) {

                System.out.println("Informe uma nota: ");
                int nota = entrada.nextInt();

                if (nota == -1) {
                    System.out.println("Média: " + (somaNotas / quantidadeNotas));
                    System.out.println("Encerrando...");
                    break;
                }

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                    continue;
                }

                somaNotas += nota;
                quantidadeNotas++;

                if (nota >= 7) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
    }
}