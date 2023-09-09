/*
* 2 – No mesmo pacote crie a classe Programa11 idêntica ao Programa10.
* Neste exemplo faremos o uso simples de uma função estática.
* Observe que foi criada uma função para calcular o valor da gratificação e esta função foi chamada na função main.
* Veja que a chamada da função foi feita com o nome da classe na frente, justamente por ser uma função estática:
* Programa11.calcGrat(sb).
* Obs.: Como as funções foram criadas na mesma classe, a chamada da função poderia ser feita sem o nome da Classe: calcGrat(sb)
* 3 – Ainda no Programa11 crie uma função para calcular o imposto (calcImp) de forma semelhante ao que foi feito para a gratificação.
* Faça as adaptações necessárias no programa.
*/

package roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {
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

            gratificacao = calcGrat(salarioBase);
            imposto = calcImposto(salarioBase);
            salarioReceber = salarioBase + gratificacao - imposto;
            System.out.println("Salário a receber: R$" + salarioReceber);
        }
    }

    public static double calcGrat(double salarioBase) {
        double gratificacao = salarioBase * 0.05;
        System.out.println("Gratificacao: R$" + gratificacao);
        return gratificacao;
    }

    public static double calcImposto(double salarioBase) {
        double imposto = salarioBase * 0.07;
        System.out.println("Imposto: R$" + imposto);
        return imposto;
    }
}
