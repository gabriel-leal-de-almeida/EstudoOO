/*

Os métodos static tem um relacionamento com uma classe como um todo, enquanto os métodos que não são static são associados a uma instância de classe específica (objeto) e podem manipular as variáveis de instância do objeto.

1 – Crie o pacote roteiro5.parte3 com a cópia das classes Principal e Loja implementadas na parte2.

2 – Crie um método na classe Loja para comparar se o faturamento de uma loja é superior ao de outra loja. Ou seja, este método deverá receber como parâmetro 2 lojas, e dentro deste método deveremos implementar a lógica para comparar as duas.

Esta solução pode ser implementada utilizando tanto um método estático quanto um não estático. O importante é entender como funciona do ponto de vista da OO, e principalmente quando e como utilizar.

3 – Como sugestão para teste, implemente o trecho de código abaixo na classe Principal 

4 – O que se espera é que nas 3 comparações acima seja apresentado o a mesma loja como a de maior faturamento. 

O que conseguiu entender sobre a utilização dos dois métodos (Estáticos e Não Estáticos) ?
R: Os métodos estáticos são métodos que não precisam de uma instância da classe para serem executados, enquanto os métodos não estáticos precisam de uma instância da classe para serem executados.

5 – Como exercício, faça com que os dois métodos (Estáticos e Não Estáticos) retornem a loja de maior faturamento. Assim, a impressão de quem é maior deve ser feita na classe Principal e não na classe Loja.

*/


package roteiro5.parte3;

public class Principal {

    public static void main(String[] args) {
        
		Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
		Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
		Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

		loja01.setValorFat(10000);
		loja02.setValorFat(20000);
		loja03.setValorFat(10000);

		System.out.println(" ****** Teste 1 ********");
		if ( loja01.getNomeFantasia() == loja03.getNomeFantasia() ){
			System.out.println("Lojas Iguais");
		}
		else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 2 ********");
		if ( loja01.getNomeFantasia().equals(loja03.getNomeFantasia())  ){
			System.out.println("Lojas Iguais");
		}
		else {
			System.out.println("Lojas Diferentes");
		}
			
		System.out.println(" ****** Teste 3 ********");
		if ( loja01 == loja03  ){
			System.out.println("Lojas Iguais");
		}
		else {
			System.out.println("Lojas Diferentes");
		}
		
		System.out.println(" ****** Teste 4 ********");
		if ( loja01.equals(loja03)  ){
			System.out.println("Lojas Iguais");
		}
		else {
			System.out.println("Lojas Diferentes");
		}

		System.out.println(" ****** Teste 5 ********");
		if ( loja01.getValorFat() == loja03.getValorFat()  ){
			System.out.println("Faturamentos Iguais");
		}
		else {
			System.out.println("Faturamentos Diferentes");
		}
		
		System.out.println(" ****** Comparação com método estático ********");
		System.out.println("Loja com maior faturamento: " + Loja.compararFat_static(loja01, loja02).getNomeFantasia());
			
		System.out.println(" ****** Comparação com método NÃO estático ********");
		System.out.println("Loja com maior faturamento: " + loja01.compararFat_naoStatic(loja02).getNomeFantasia());
			
		System.out.println(" ****** Comparação com método NÃO estático ********");
		System.out.println("Loja com maior faturamento: " + loja02.compararFat_naoStatic(loja01).getNomeFantasia());
			
	}  
}
