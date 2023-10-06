package roteiro7.parte1;

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;
    
    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplinas = pQtdeDisciplinas;     
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
    
    public void setCurso() {
        this.curso = curso;
    }


    public int getAnoIngresso() {
        return anoIngresso;
    }
    
    public void setAnoIngresso() {
        this.anoIngresso = anoIngresso;
    }
    
    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }
    
    public void setQtdeDisciplinas() {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }
        
    public String getSituacao() {
        return situacao;   
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}