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

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){

        this.nomeFantasia = nomeFantasia;
        
        if (razaoSocial.equals("")){
            this.razaoSocial = nomeFantasia;
        }
        else {
            this.razaoSocial = razaoSocial;
        }

        this.cnpj = cnpj;
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
