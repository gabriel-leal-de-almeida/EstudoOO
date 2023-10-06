package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;
    private ArrayList<String> listaDisciplinas;

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplinas = pQtdeDisciplinas;    
        this.listaDisciplinas = new ArrayList<>(); 
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


    public ArrayList getListaDisciplinas(){
        return listaDisciplinas;
    }

    public void adicionarDisciplina (String disciplina){
        listaDisciplinas.add(disciplina);
    }

    public ArrayList<String> getDisciplinasMatriculadas() {
        return listaDisciplinas;
    }
}


