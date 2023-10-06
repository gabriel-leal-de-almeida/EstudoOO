package roteiro7.parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
 
    public static void main(String[] args) {
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

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
            scanner.nextLine();

            for (int j = 0; j < qtdeDisciplinas; j++){
                System.out.println("Disciplina " +(j + 1));
                String disciplina = scanner.nextLine();

                aluno.adicionarDisciplina(disciplina);
            }
            listaAlunos.add(aluno);
            System.out.println("********************************");
       }
       
        
      System.out.println("Listando os Alunos : ");
      System.out.println("********************************");

      for (Aluno aluno : listaAlunos) {
            System.out.println("Matricula : " + aluno.getMatricula());
            System.out.println("Nome : " + aluno.getNome());
            System.out.println("Curso : " + aluno.getCurso());
            System.out.println("Ano Ingresso : " + aluno.getAnoIngresso());
            System.out.println("Qntd Disciplinas : " + aluno.getQtdeDisciplinas());
         
         ArrayList<String> disciplinas = aluno.getListaDisciplinas();
         for (String disciplina : disciplinas) {
             System.out.println("Disciplina: " + disciplina);
         }
         System.out.println("********************************");
     } 
    }
}