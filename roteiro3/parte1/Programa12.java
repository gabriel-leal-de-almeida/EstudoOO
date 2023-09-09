/*
* 4 – Ao criar uma função para o cálculo da gratificação e outra para o cálculo do imposto, provavelmente terá criado 2 funções idênticas.
* Ter duas funções que fazem praticamente a mesma coisa não é adequado, pois caracteriza duplicidade de código.
* Crie agora uma classe Programa12 no mesmo pacote, onde o cálculo da gratificação e do imposto fosse feito através de uma única função.
* Faça as adaptações necessárias no código.
*/

package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            double salarioBase = 0;
            while (salarioBase <= 0) {
                try {
                    System.out.println("Informe o salário base: ");
                    salarioBase = entrada.nextDouble();
                    if (salarioBase <= 0) {
                        System.out.println("Salário inválido. Por favor, informe um valor maior que zero.");
                    }
                } catch (Exception e) {
                    System.out.println("Salário inválido. Por favor, informe um valor maior que zero.");
                    entrada.nextLine();
                }
            }
            double gratificacao = calcComposicaoSalarial(salarioBase, "gratificacao");
            double imposto = calcComposicaoSalarial(salarioBase, "imposto");
            double salarioReceber = salarioBase + gratificacao - imposto;
            System.out.println("Salário a receber: R$" + salarioReceber);
        }
    }

    public static double calcComposicaoSalarial(double salarioBase, String tipo) {        
        switch (tipo) {
            case "gratificacao":
                double gratificacao = salarioBase * 0.05;
                System.out.println("Gratificacao: R$" + gratificacao);
                return gratificacao;
            case "imposto":
                double imposto = salarioBase * 0.07;
                System.out.println("Imposto: R$" + imposto);
                return imposto;
            default:
                return 0;
        }
    }
}
