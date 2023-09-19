/*
1 – Crie o pacote roteiro4.parte2 com a cópia das classes Principal  e Aluno implementados na parte1. 

Nesta atividade iremos criar o chamado Método Construtor da classe Aluno. Ele é o método que permite a criação do objeto. Implemente o método construtor conforme o código abaixo.

Atenção :
•	O método construtor deve ter exatamente o mesmo nome da classe. 
•	Neste método construtor em específico, ele recebe como parâmetro as variáveis : pMatricula, String pNome, String pCurso, int pAnoIngresso . E elas são usadas para preencher os respectivos atributos do objeto. 

2 – Na parte2 criamos o objeto aluno01, e no construtor do objeto foi passada todas as informações sobre os atributos deste objeto. Supondo que depois de criado o objeto aluno01, seja necessário modificar o número de matrícula deste aluno. Uma possível solução pode ser implementada conforme o código abaixo.

Faça os devidos testes e verifique se os dados do objeto aluno01 realmente foram modificados.

*/

package roteiro4.parte2;


public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

        Aluno aluno02 = new Aluno(1, "Gabriel", "Engenharia da Computação", 2020);

        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);
    }
}