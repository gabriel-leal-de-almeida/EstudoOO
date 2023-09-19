/*

O nosso pequeno cenário de um projeto de POO evolui como todo projeto de software. Precisamos criar 2 novos atributos na classe Aluno : 
•	qtdeDisciplinas – um número inteiro para indicar a quantidade de disciplina que o aluno está matriculado.
•	situacao – uma string para guarda a informação de quando o aluno está matriculado ou não (Matriculado / Não Matriculado).

Não é desejável que na implementação o aluno tenha a possibilidade de :
•	qtdeDisciplina = 0 e esteja com situacao = “Matriculado”
•	qtdeDisciplina = 1 e esteja com situacao = “Não Matriculado” 

1 – Crie o pacote roteiro4.parte4 com a cópia das classes Principal  e Aluno implementados na parte3. 
2 – Seguindo as boas práticas de OO, crie os 2 atributos indicados acima com o acesso private.
3 – Analise e implemente a melhor forma que você acredita que estes 2 novos atributos devam ser contemplados no método construtor da classe Aluno.
4 – Faça as devidas adaptações na classe Principal para que seja possível testar o cenário descrito nesta etapa do projeto.
5 – Faça as adaptações na classe Principal para que os inputs do usuário sejam feitos utilizando o Scanner, e que preencham os dados do objeto aluno01. 

*/

package roteiro4.parte4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int matricula = -1;            
            while (matricula < 0) {
                System.out.print("Digite a matrícula do aluno: ");
                if (scanner.hasNextInt()) {
                    matricula = scanner.nextInt();
                    if (matricula >= 0) {
                        break;
                    } else {
                        System.out.println("A matrícula deve ser maior ou igual a 0.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scanner.next();
                }
            }

            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.print("Digite o curso do aluno: ");
            String curso = scanner.next();

            int anoIngresso = -1;            
            while (anoIngresso < 0) {
                System.out.print("Digite o ano de ingresso do aluno: ");
                if (scanner.hasNextInt()) {
                    anoIngresso = scanner.nextInt();
                    if (anoIngresso >= 0) {
                        break;
                    } else {
                        System.out.println("O ano de ingresso deve ser maior ou igual a 0.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scanner.next();
                }
            }

            int qtdeDisciplinas = -1;
            while (qtdeDisciplinas < 0) {
                System.out.print("Digite a quantidade de disciplinas do aluno: ");
                if (scanner.hasNextInt()) {
                    qtdeDisciplinas = scanner.nextInt();
                    if (qtdeDisciplinas >= 0) {
                        break;
                    } else {
                        System.out.println("A quantidade de disciplinas deve ser maior ou igual a 0.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scanner.next();
                }
            }
            String situacao;
            if (qtdeDisciplinas == 0) {
                situacao = "Não Matriculado";
            } else if (qtdeDisciplinas >= 1) {
                situacao = "Matriculado";
            } else {
                situacao = "Indefinido";
            }

            Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas, situacao);

            System.out.println("Matricula : " + aluno01.getMatricula());
            System.out.println("Nome : " + aluno01.getNome());
            System.out.println("Curso : " + aluno01.getCurso());
            System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
            System.out.println("Quantidade de Disciplinas : " + aluno01.getQtdeDisciplinas());
            System.out.println("Situação : " + aluno01.getSituacao());
        }
    }
}