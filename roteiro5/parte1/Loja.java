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
