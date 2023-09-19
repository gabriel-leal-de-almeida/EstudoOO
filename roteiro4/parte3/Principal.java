/*

1 – Crie o pacote roteiro4.parte3 com a cópia das classes Principal  e Aluno implementados na parte2. 


2 – Na parte2 criamos o objeto aluno01, e no construtor do objeto foi passada todas as informações sobre os atributos deste objeto. Supondo que depois de criado o objeto aluno01, seja necessário modificar o número de matrícula deste aluno. Uma possível solução pode ser implementada conforme o código abaixo.

Faça os devidos testes e verifique se os dados do objeto aluno01 realmente foram modificados.

3 – A solução indicada no item 2 apesar de funcionar, não é uma boa prática indicada pela POO. O recomendado é que nenhuma classe tenha os seus dados (atributos) acessíveis diretamente. A solução do item 2 só foi possível porque os atributos da classe Aluno são públicos. Para resolver esta questão, modifique o controle de acesso dos atributos da classe Aluno conforme código abaixo. Faça os devidos testes e avalie o impacto desta mudança.

4 – A mudança no item 3 provavelmente causou problema na classe Principal, justamente porque os atributos do objeto aluno01 se tornaram inacessíveis. É daí que vem a necessidade do conceito de encapsulamento na POO.

Segue algumas definições para encapsulamento

•	O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe.  
•	O Encapsulamento faz com que os atributos/dados de um objeto não fiquem tão facilmente acessíveis. Ou seja, só conseguimos modificar ou acessar os dados de um objeto através de um método.
•	Encapsulamento é a técnica que faz com que detalhes internos de uma classe permaneçam ocultos conforme a necessidade e o contexto.

Precisamos criar alguns métodos na classe Aluno que permitam “consultar” (Get) um determinado atributo, e outros métodos que permitam “editar” (Set) um determinado atributo. Comumente chamamos este conjunto de métodos na POO de Gets e Sets.

No código abaixo criamos os Gets e Sets para os atributos matrícula e nome. Crie os métodos correspondentes para os outros atributos.

OBS.: Normalmente as IDEs como Netbeans, VSCode e outras possuem recursos para gerar os Gets e Sets automaticamente. Vale a pena verificar este recurso.

5 – Depois de implementar os métodos Gets e Sets na classe Aluno é necessário fazer os devidos ajustes na classe Principal.

*/

package roteiro4.parte3;


public class Principal {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

        Aluno aluno02 = new Aluno(1, "Gabriel", "Engenharia da Computação", 2020);

        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
        System.out.println("Matricula : " + aluno02.getMatricula());
        System.out.println("Nome : " + aluno02.getNome());
        System.out.println("Curso : " + aluno02.getCurso());
        System.out.println("Ano Ingresso : " + aluno02.getAnoIngresso());

        aluno01.setMatricula(222);
        aluno02.setMatricula(2);
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Matricula : " + aluno02.getMatricula());
    }
}