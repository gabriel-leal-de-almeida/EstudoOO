/*
* 1 – Crie o pacote roteiro2.parte2 com a classe Programa03 conforme o código abaixo.
* Neste programa vamos capturar a entrada de dados do usuário com o uso de um pacote gráfico.
* Teremos que importar também o JOptionPane.
*/

/*
* 2 – Qual a diferença percebida entre o input das variáveis nome e idade?
* O input da variável nome é feito através de uma caixa de diálogo que só aceita letras.
* O input da variável idade é feito através de uma caixa de diálogo que só aceita números inteiros.
*/

package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args) {
        String nome = "";
        boolean nomeValido = false;
        while (!nomeValido) {
            try {
                nome = JOptionPane.showInputDialog("Informe o seu nome: ");
                if (nome.matches("^[a-zA-Z]+$")) {
                    nomeValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Nome inválido. Por favor, informe apenas letras.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Nome inválido. Por favor, informe apenas letras.");
            }
        }
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);

        int idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                String strIdade = JOptionPane.showInputDialog("Informe a sua idade: ");
                idade = Integer.parseInt(strIdade);
                idadeValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Idade inválida. Por favor, informe um número inteiro.");
            }
        }
        JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
    }
}
