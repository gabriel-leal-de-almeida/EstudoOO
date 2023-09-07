/*
* 2 – Crie a classe Programa05 no mesmo pacote de forma semelhante ao Programa04.
* Este novo programa deve apresentar o mesmo resultado anterior, mas usando o for como estrutura de repetição
*/

package roteiro2.parte3;

import java.util.Scanner;

public class Programa05 {
    
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            for (int cont = 0; cont < 5; cont++) {
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
            }
        }
    }
}