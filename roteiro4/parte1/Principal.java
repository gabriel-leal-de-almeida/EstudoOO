/*
1 – Crie o pacote roteiro4.parte1 com a classes Principal  e Aluno conforme o código abaixo. 

Atenção : 
•	A boa prática da programação OO indica que os nomes das classes devem sempre iniciar com letras maiúsculas.
•	A classe Aluno tem apenas os atributos : matrícula, nome, curso, anoIngresso. 
•	E a classe Principal tem o método main que utilizamos ele para instanciar o objeto aluno01, conforme o destaque em amarelo.


Faça os testes rodando a classe Principal.
*/

package roteiro4.parte1;


public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "Jose";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;

        Aluno aluno02 = new Aluno();
        aluno02.matricula = 1;
        aluno02.nome = "Gabriel";
        aluno02.curso = "Engenharia da Computação";
        aluno02.anoIngresso = 2020;

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