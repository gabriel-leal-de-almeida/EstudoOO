/*

5 – Com o que foi implementado até o momento, seria possível, por exemplo encerrar esta ligação do item 4 com o horário de “10:20:35” ?
R: Seria possível. Para isso, utilizaríamos o método setHoraFim() da classe Ligacao.

6 – Com o horário encerrado, ou seja, com os horários de início e término preenchidos, teríamos como calcular o tempo de duração desta ligação?
Sim ou Não? Como?
R: Sim, porém precisaríamos implementar uma classe Tempo com os métodos apropriados para realizar o cálculo.

*/

package roteiro6.parte2;

public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;
    
    
    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }
    }
    
}
