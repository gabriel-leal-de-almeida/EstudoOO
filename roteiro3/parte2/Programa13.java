/*
 * 1 - Crie o pacote roteiro3.parte2 com a classe Programa13 conforme o código abaixo.
 * Este programa simula uma calculadora com operações básicas de soma, subtração, multiplicação e divisão.
 */

package roteiro3.parte2;

import java.util.Scanner;

public class Programa13 {
    
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            double x = 0, y = 0;

            while (true) {
                try {
                    System.out.println("Informe o valor de x: ");
                    x = entrada.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Valor inválido.");
                    entrada.nextLine();
            }
            }
            
            System.out.println("Informe a operacao (+, -, *, /): ");
            String operacao = entrada.next();

            while (true) {
                try {
                    System.out.println("Informe o valor de y: ");
                    y = entrada.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Valor inválido.");
                    entrada.nextLine();
            }
            }

            switch (operacao) {
                case "+": soma(x, y);
                    break;
                case "-": subtracao(x, y);
                    break;
                case "*": multiplicacao(x, y);
                    break;
                case "/": divisao(x, y);
                    break;
                default:
                    System.out.println("Operação inválida.");

            }
        }
    }

    public static void soma(double x, double y) {
        System.out.println("Resultado: " + (x + y));
    }

    public static void subtracao(double x, double y) {
        System.out.println("Resultado: " + (x - y));
    }

    public static void multiplicacao(double x, double y) {
        System.out.println("Resultado: " + (x * y));
    }

    public static void divisao(double x, double y) {
        if (y == 0) {
            System.out.println("Não é possível dividir por zero.");
            return;
        }
        System.out.println("Resultado: " + (x / y));
    }
}
