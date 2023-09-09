/*
 * 2 – Observe que no Programa13 as funções de soma, subtração, multiplicação e divisão, foram criadas com o retorno “void”.
 * Ou seja, são funções que não geram resultado de retorno para quem as chama.
 * Crie uma classe Programa14 idêntico ao Programa13, de forma que as funções de soma, subtração, multiplicação e divisão gerem o retorno para a função main, e que o resultado da operação seja apresentado na função main (output) .
 */

package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            double x = 0, y = 0;            
            String operacao;

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
            
            while (true) {
                System.out.println("Informe a operacao (+, -, *, /): ");
                operacao = entrada.next();
                if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
                    break;
                } else {
                    System.out.println("Operacao inválida. Tente novamente.");
                }
            }

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
                case "+":
                    System.out.println("Resultado: " + soma(x, y));
                    break;
                case "-":
                    System.out.println("Resultado: " + subtracao(x, y));
                    break;
                case "*":
                    System.out.println("Resultado: " + multiplicacao(x, y));
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Não é possível dividir por zero.");
                        break;
                    }
                    System.out.println("Resultado: " + divisao(x, y));
                    break;
                default:
                    System.out.println("Operação inválida.");

            }
        }
    }

    public static double soma(double x, double y) {
        return (x + y);
    }

    public static double subtracao(double x, double y) {
        return (x - y);
    }

    public static double multiplicacao(double x, double y) {
        return (x * y);
    }

    public static double divisao(double x, double y) {
        return (x / y);
    }
}
