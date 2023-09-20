/*

5 – Com o que foi implementado até o momento, seria possível, por exemplo encerrar esta ligação do item 4 com o horário de “10:20:35” ?
R: Seria possível. Para isso, utilizaríamos o método setHoraFim() da classe Ligacao.

6 – Com o horário encerrado, ou seja, com os horários de início e término preenchidos, teríamos como calcular o tempo de duração desta ligação?
Sim ou Não? Como?
R: Sim, porém precisaríamos implementar uma classe Tempo com os métodos apropriados para realizar o cálculo.

*/

package roteiro6.parte2;

public class Ligacao {

    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
    
    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio){
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

}
