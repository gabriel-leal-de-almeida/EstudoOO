/*

1 – Crie o pacote roteiro5.parte2 com a cópia das classes Principal e Loja implementadas na parte1.

2 -  Iremos agora aplicar os nossos conhecimentos de Sobrecarga de Métodos. A solução adotada no item 5 da Parte1 apesar de funcionar não é muito adequada. Podemos utilizar recursos da OO para tornar o código mais limpo e até reutilizável.

O adequado neste caso é aplicar a sobrecarga no método construtor. Ou seja, teremos 2 construtores que recebem diferentes parâmetros, cada um deve ser utilizado conforme a necessidade. 

2 – Aplique agora as chamadas adequadas na classe Principal.

3 – Com sobrecarga do método construtor podemos otimizar o código ainda mais promovendo reutilização de código.

Podemos apenas chamar o 1º Construtor de dentro do 2º Construtor passando os parâmetros da forma desejada. Assim eliminamos linhas de código desnecessárias, pois estaremos de fato fazendo reutilização de código.

4 – Para atividade final faça os testes abaixo na classe Principal. O objetivo é compreender como funciona os objetos instanciados e como testá-los.

Abaixo fizemos 4 testes (Teste1, Teste2, Teste3, Teste4, Teste5 ). Avalie os resultados apresentados e a diferença entre eles. 

O que conseguiu concluir sobre os testes feitos ?
R: Os testes 1 e 2 têm como output o mesmo resultado, pois o operador == compara o endereço de memória dos objetos, e o operador .equals compara o conteúdo dos objetos. Nas duas situações, a condição era verdadeira, o que resultou em "Lojas Iguais". Já nos testes 3 e 4, o output foi diferente, pois o operador == compara o endereço de memória dos objetos, e o operador .equals compara o conteúdo dos objetos. Nas duas situações, a condição era falsa, o que resultou em "Lojas Diferentes". No teste 5, o output foi "Faturamentos Iguais", pois o operador == compara o endereço de memória dos objetos. Nessa situação, a condição era verdadeira.

No Teste5 é possível utilizar o operador .equals ? 
R: Não é possível utilizar o operador .equals para comparar tipos primittivos, apenas para objetos.

*/

package roteiro5.parte2;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public Loja(String nomeFantasia, String cnpj){
       
        this(nomeFantasia, nomeFantasia, cnpj);
    }


    public String getNomeFantasia(){
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial(){
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public double getValorFat(){
        return this.valorFat;
    }

    public void setValorFat(double valorFat){
        this.valorFat = valorFat;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area = area;
    }

}
