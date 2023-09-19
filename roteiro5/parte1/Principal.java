/*

1 – Crie o pacote roteiro5.parte1 com a classes Principal e Loja . Conforme o cenário descrito, teremos que criar os seguintes atributos para a classe Loja :

•	String nomeFantasia
•	String razaoSocial
•	String cnpj
•	double valorFat
•	double área
•	String nomeProprietario
 
Crie os atributos indicados na classe Loja com o acesso private.

2 – Implemente os métodos Gets e Sets da classe Loja.

3 – Agora iremos implementar o método construtor de forma que ele receba como parâmetro o nome de Fantasia, a Razão Social e o CNPJ.

Observe que no código abaixo utilizamos a palavra reservada this para acessar os atributos. Sempre que estamos implementando qualquer código dentro de uma classe específica (neste caso Loja) e queremos acessar um atributo ou método, podemos usar this conforme o exemplo abaixo (com exceção os atributos ou métodos estáticos - static). 

Neste caso, o this também foi útil para diferenciar as variáveis recebidas como parâmetro no construtor, dos atributos da classe 

4 – Precisamos testar o funcionamento da classe Loja. crie na classe Principal o objeto loja01 e faça os devidos testes.

Observe que alguns atributos não foram passados no construtor. O que acontece quando exibimos os dados da loja01 ? Atenção para valores null.

5 -  No momento do cadastro da loja nem sempre é possível ter as 3 informações do construtor (Nome de Fantasia, Razão Social e CNPJ). Na maioria das vezes o usuário possui apenas o Nome de Fantasia e o CNPJ.  Desta forma, definimos a seguinte regra de negócio : Sempre que não tivermos a Razão Social, iremos preencher este atributo com o Nome de Fantasia.  

Trata-se de um problema relativamente simples de resolver, basta testar o parâmetro razaoSocial no construtor da classe Loja


6 – Para testar a solução criamos 2 objetos do tipo Loja na classe Principal (loja01 e loja02). A loja02 não tem a Razão Social. Ao imprimir os dados das duas lojas, tivemos o resultado esperado ? A solução implementada no item 5 resolveu o problema ? 

R: Sim, tivemos o resultado esperado. A solução implementada no item 5 resolveu o problema.

*/

package roteiro5.parte1;

public class Principal {

    public static void main(String[] args) {
        
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");

        System.out.println("Nome Fantasia : " + loja01.getNomeFantasia());
        System.out.println("Razão Social : " + loja01.getRazaoSocial());
        System.out.println("CNPJ : " + loja01.getCnpj());
        System.out.println("Valor Faturamento : " + loja01.getValorFat());
        System.out.println("Área : " + loja01.getArea());
        System.out.println("Nome Fantasia : " + loja02.getNomeFantasia());
        System.out.println("Razão Social : " + loja02.getRazaoSocial());
        System.out.println("CNPJ : " + loja02.getCnpj());
        System.out.println("Valor Faturamento : " + loja02.getValorFat());
        System.out.println("Área : " + loja02.getArea());
          
      }
  
}
