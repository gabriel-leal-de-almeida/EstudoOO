/* 
* 1 – Crie o pacote roteiro3.parte1 com a classe Programa10 conforme o código abaixo.
* O cenário implementado abaixo diz respeito ao seguinte problema :
* “Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário a receber.
* Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário -base e paga imposto de 7% também sobre o salário-base.”
* Faça os devidos testes para verificar se a solução implementada foi atendida.
*/

package roteiro3.parte1;

import java.util.Scanner;

public class Programa10 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            double salarioBase, gratificacao, imposto, salarioReceber;
            salarioBase = 0;

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

            gratificacao = salarioBase * 0.05;
            System.out.println("Gratificacao: R$" + gratificacao);
            imposto = salarioBase * 0.07;
            System.out.println("Imposto: R$" + imposto);
            salarioReceber = salarioBase + gratificacao - imposto;
            System.out.println("Salário a receber: R$" + salarioReceber);
        }
    }
}