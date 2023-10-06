package roteiro7.parte1;

import java.util.Scanner;

public class Principal {
 
    public static void main(String[] args) {
        
 //Criando um vetor estático de objetos Aluno
       Aluno[] listaAlunos = new Aluno[3];
       Scanner scanner = new Scanner(System.in);
 
       System.out.println("Entrada de dados dos alunos: ");
       System.out.println("********************************"); 
       
       for (int i = 0; i < 3; i++){

            System.out.println("Matricula do aluno " +(i + 1));
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nome do aluno " +(i + 1));
            String nome = scanner.nextLine();

            System.out.println("Curso do aluno " +(i + 1));
            String curso = scanner.nextLine();

            System.out.println("Ano ingresso do aluno " +(i + 1));
            int anoIngresso = scanner.nextInt();
            
            System.out.println("Qntd de Diciplinas do aluno " +(i + 1));
            int qtdeDisciplinas = scanner.nextInt();

            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);

            listaAlunos[i] = aluno;

            System.out.println("********************************");
       }


       System.out.println("Listando os Alunos : ");
       System.out.println("********************************");
       for (int i = 0; i < 3; i++) {
          System.out.println("Matricula : " + listaAlunos[i].getMatricula());
          System.out.println("Nome : " + listaAlunos[i].getNome());
          System.out.println("Curso : " + listaAlunos[i].getCurso());
          System.out.println("Ano Ingresso : " + listaAlunos[i].getAnoIngresso());   
          System.out.println("Qntd de Disciplinas : " + listaAlunos[i].getQtdeDisciplinas());            
          System.out.println("********************************");
       }
        
    }
}
