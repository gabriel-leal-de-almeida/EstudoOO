/*
1 – Crie o pacote roteiro4.parte2 com a cópia das classes Principal  e Aluno implementados na parte1. 

Nesta atividade iremos criar o chamado Método Construtor da classe Aluno. Ele é o método que permite a criação do objeto. Implemente o método construtor conforme o código abaixo.

Atenção :
•	O método construtor deve ter exatamente o mesmo nome da classe. 
•	Neste método construtor em específico, ele recebe como parâmetro as variáveis : pMatricula, String pNome, String pCurso, int pAnoIngresso . E elas são usadas para preencher os respectivos atributos do objeto. 
*/

package roteiro4.parte2;

public class Aluno {
    
    public int matricula;
    public String nome;
    public String curso;
    public int anoIngresso;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }
}