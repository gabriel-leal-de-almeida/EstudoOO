/*

5 – Com o que foi implementado até o momento, seria possível, por exemplo encerrar esta ligação do item 4 com o horário de “10:20:35” ?
R: Seria possível. Para isso, utilizaríamos o método setHoraFim() da classe Ligacao.

6 – Com o horário encerrado, ou seja, com os horários de início e término preenchidos, teríamos como calcular o tempo de duração desta ligação?
Sim ou Não? Como?
R: Sim, porém precisaríamos implementar uma classe Tempo com os métodos apropriados para realizar o cálculo.

*/

package roteiro6.parte2;

public class Principal {

    public static void main(String[] args) {
        
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 15, 2));

        System.out.println("Numero de origem: " + lig01.getNumOrigem());
        System.out.println("Numero de destino: " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de inicio: " + lig01.getHoraInicio());
        System.out.println("Hora de fim: " + lig01.getHoraFim());
    }
}
