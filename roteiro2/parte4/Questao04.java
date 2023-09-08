/*
* 4 – Utilizando a classe Programa07 implementado no pacote roteiro2.parte3, seria possível implementar uma solução que apresentasse não somente a média, mas quantas notas ficaram acima da média?
* Sim? Não? Como? Por quê?
*/

package roteiro2.parte4;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
            
        try (Scanner entrada = new Scanner(System.in)) {
            
            float somaNotas = 0;
            int quantidadeNotas = 0;
            int media = 7;
            int notasAcimaMedia = 0;
        
            while (true) {

                System.out.println("Informe uma nota: ");
                int nota = entrada.nextInt();

                if (nota == -1) {
                    System.out.println("Média: " + (somaNotas / quantidadeNotas));
                    System.out.println("Encerrando...");
                    System.out.println("Notas acima da média: " + notasAcimaMedia);
                    break;
                }

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                    continue;
                }

                somaNotas += nota;
                quantidadeNotas++;

                if (nota >= media) {
                    System.out.println("Aprovado!");
                    notasAcimaMedia++;
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
    }
}