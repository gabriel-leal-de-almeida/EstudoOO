/*
 * 3 – Supondo agora que o input de notas não tenha uma quantidade definida e dependa de um flag.
 * Ou seja, o usuário precisaria indicar algum valor que encerre o input de notas (exemplo flag = -1).
 * Crie uma classe Programa06 no mesmo pacote como uma proposta para esta situação.
 */

package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
        
            while (true) {
                System.out.println("Informe uma nota: ");
                int nota = entrada.nextInt();

                if (nota == -1) {
                    System.out.println("Encerrando...");
                    break;
                }

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                    continue;
                }

                if (nota >= 7) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
    }
}