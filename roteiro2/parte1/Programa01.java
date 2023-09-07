/*
* 1 – Crie o pacote roteiro2.parte1 com a classe Programa01 conforme o código abaixo.
* Observe que existem algumas variáveis declaradas com os tipos mais utilizados.
* Veja que uma das variáveis está sendo exibido em tela. Faça testes com as outras variáveis.
*/

package roteiro2.parte1;

public class Programa01 {
    public static void main(String[] args) {
        int idade = 18;
        char letra = 'a';
        float numeroFloat = 3.14159f;
        double numeroDouble = 2.71828;
        String nome = "Isaac Newton";

        System.out.println("Exibir: " + numeroFloat);
        System.out.println("Exibir: " + numeroDouble);
        System.out.println("Exibir: " + nome);
        System.out.println("Exibir: " + idade);
        System.out.println("Exibir: " + letra);
    }
}