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

public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas, String pSituacao){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplinas = pQtdeDisciplinas;
        situacao = pSituacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String pSituacao) {
        situacao = pSituacao;
    }
}