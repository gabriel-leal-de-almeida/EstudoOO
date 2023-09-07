/*
* 2 – Crie agora uma classe no mesmo pacote chamado Programa02.
* Neste programa vamos capturar a entrada de dados do usuário, e para isso precisaremos importar a classe Scanner do Java.
* Implemente a classe Programa02 conforme o código abaixo
* 3 – Faça os devidos testes rodando o Programa02 e teste como seria uma entrada de dados de um tipo numérico.
* OBS.: a classe Scanner faz uso de conceitos de OO que serão melhor detalhados posteriormente.
*/

package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Nome informado: " + nome);

        entrada.close();
}
}