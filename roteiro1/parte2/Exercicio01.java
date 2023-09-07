// Mantendo o padrão de organização dos nossos estudos, crie um pacote dentro do projeto e coloque o nome roteiro1.parte2.
// Cálculo de Salário.
// Escreva um programa em Java para calcular o salário total de um funcionário. O programa deve conter o valor do salário-base mensal que compreende um total de 40 horas. O programa também deve conter o número de horas extra trabalhadas no mês.
// Em seguida, calcule o salário total considerando que cada hora extra trabalhada vale o mesmo que uma hora regular. Por fim, exiba o salário total na tela.
// O programa abaixo já tem o escopo do programa imprimindo o salário base. Complemente o programa para atender o que se pede informando o salário total. Faça também os devidos testes e simulações para as horas extra.
// Dica: O valor da hora extra é calculado dividindo o salário-base pelo número de horas trabalhadas no mês.
package roteiro1.parte2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o salário base: ");
            double salarioBase = scanner.nextDouble();
            if (salarioBase < 0) {
                System.out.println("Salário base não pode ser negativo.");
                return;
            }

            System.out.print("Digite o número de horas extras: ");
            int numHoraExtra = scanner.nextInt();
            if (numHoraExtra < 0) {
                System.out.println("Número de horas extras não pode ser negativo.");
                return;
            }

            System.out.print("Digite o número de horas trabalhadas por mês: ");
            int numHorasTrabalhadas = scanner.nextInt();
            if (numHorasTrabalhadas < 0) {
                System.out.println("Número de horas trabalhadas não pode ser negativo.");
                return;
            }

            double valorHora = salarioBase / numHorasTrabalhadas;
            double valorHoraExtra = numHoraExtra * valorHora;

            System.out.println("Salario base: " + salarioBase);
            System.out.println("Valor hora: " + valorHora);
            System.out.println("Valor hora extra: " + valorHoraExtra);
            System.out.println("Salario final: " + (salarioBase + valorHoraExtra));
        }
    }
}