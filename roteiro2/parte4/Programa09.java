/*
 * 3 – Crie uma nova classe Programa09 idêntica ou Programa08, e implemente uma solução que armazene no vetor apenas notas consideradas válidas.
 * Ou seja, notas inseridas com o valor de 0 a 10. Caso não seja uma nota válida, o programa deve informar que a nota é inválida, e não deve armazenar esta nota.
 * Atenção : O programa também deve garantir que todo o vetor será preenchido com notas válidas.
 */

package roteiro2.parte4;

import java.util.Scanner;

public class Programa09 {
    
    public static void main(String[] args) {
    
        try (Scanner entrada = new Scanner(System.in)) {

            int[] vetorNotas = new int[5];
            int cont = 0;

            while (cont < vetorNotas.length) {
                System.out.print("Informe uma nota: ");
                int nota = entrada.nextInt();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                    continue;
                }

                vetorNotas[cont] = nota;
                cont++;
            }

            for (int i = 0; i < vetorNotas.length; i++) {
                System.out.println("Nota " + i + ": " + vetorNotas[i]);
            }
        }
    }
}