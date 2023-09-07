/*
 * 1 – Crie o pacote roteiro2.parte4 com a classe Programa08 conforme o código abaixo e analise e teste o que foi implementado.
 * 2 – Ainda na classe Programa08, depois do laço de repetição já existente, implemente um novo laço de repetição apenas para exibir os valores armazenados no vetor.
 * Verifique se as notas exibidas estão corretas.
 */

package roteiro2.parte4;

import java.util.Scanner;

public class Programa08 {
    
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {

            int[] vetorNotas = new int[5];

            for (int cont = 0; cont < 5; cont++) {
                System.out.print("Informe uma nota: ");
                int nota = entrada.nextInt();

                vetorNotas[cont] = nota;
            }

            for (int cont = 0; cont < vetorNotas.length; cont++) {
                System.out.println("Nota " + cont + ": " + vetorNotas[cont]);
            }
        }
    }
}
