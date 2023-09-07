/*
* 1 – Crie o pacote roteiro2.parte3 com a classe Programa04 conforme o código abaixo e analise e teste o que foi implementado.
*/

package roteiro2.parte3;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            int cont = 0;
            while (cont < 5) {
                System.out.println("Informe uma nota: ");
                int nota = entrada.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                    continue;
                }

                if (nota >= 7) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }

                cont++;
            }
        }
    }  
}
