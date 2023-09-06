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