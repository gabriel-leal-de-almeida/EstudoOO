/*

Os métodos static tem um relacionamento com uma classe como um todo, enquanto os métodos que não são static são associados a uma instância de classe específica (objeto) e podem manipular as variáveis de instância do objeto.

1 – Crie o pacote roteiro5.parte3 com a cópia das classes Principal e Loja implementadas na parte2.

2 – Crie um método na classe Loja para comparar se o faturamento de uma loja é superior ao de outra loja. Ou seja, este método deverá receber como parâmetro 2 lojas, e dentro deste método deveremos implementar a lógica para comparar as duas.

Esta solução pode ser implementada utilizando tanto um método estático quanto um não estático. O importante é entender como funciona do ponto de vista da OO, e principalmente quando e como utilizar.

3 – Como sugestão para teste, implemente o trecho de código abaixo na classe Principal 

4 – O que se espera é que nas 3 comparações acima seja apresentado o a mesma loja como a de maior faturamento. 

O que conseguiu entender sobre a utilização dos dois métodos (Estáticos e Não Estáticos) ?

5 – Como exercício, faça com que os dois métodos (Estáticos e Não Estáticos) retornem a loja de maior faturamento. Assim, a impressão de quem é maior deve ser feita na classe Principal e não na classe Loja.

*/

package roteiro5.parte3;

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

    public static Loja compararFat_static(Loja lojaA, Loja lojaB ){
        
        if (lojaA.getValorFat() > lojaB.getValorFat()){
            return lojaA;
        }
        else {
            return lojaB;
        }
    }

    public Loja compararFat_naoStatic(Loja lojaB ){
        
        if (this.getValorFat() > lojaB.getValorFat()){
            return this;
        }
        else {
            return lojaB;
        }
    }

}
