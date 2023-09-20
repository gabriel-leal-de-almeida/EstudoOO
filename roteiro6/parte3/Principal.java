/*

1 – Crie o pacote roteiro6.parte3 com a cópia das classes Principal, Ligacao e Tempo implementadas na parte2.

2 – Implemente um método na classe Ligação para verificar se um dado número faz parte na ligação. Ou seja, o método deve verificar se o número informado é a origem ou o destino da ligação, ou mesmo se o número não existe nesta ligação.

3 – Implemente um método para calcular o valor da ligação. Considere que o valor da ligação vale R$1,00 por minuto.
OBS.: Divida as responsabilidades e implemente métodos nas classes apropriadas.

4 – Implemente um novo método para calcular o valor da ligação. De forma semelhante ao item 3, considere que o valor da ligação vale R$1,00 por minuto. Mas neste novo método, considere que será cobrado o valor do minuto mesmo que a ligação dure 20 segundos.
 
5 – Faça os testes necessários na classe Principal e compare os resultados.

*/

package roteiro6.parte3;

public class Principal {

    public static void main(String[] args) {
        
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 15, 2));

        System.out.println("Numero de origem: " + lig01.getNumOrigem());
        System.out.println("Numero de destino: " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de inicio: " + lig01.getHoraInicio());
        System.out.println("Hora de fim: " + lig01.getHoraFim());

        lig01.setHoraFim(new Tempo(10, 20, 30));

        System.out.println("Hora de fim: " + lig01.getHoraFim());

        System.out.println("Valor da ligacao: " + lig01.calcularValorLigacao());
        
        System.out.println("Valor da ligacao: " + lig01.calcularValorLigacaoComCobrancaMinima());
    }
}
