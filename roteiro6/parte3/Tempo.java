/*

1 – Crie o pacote roteiro6.parte3 com a cópia das classes Principal, Ligacao e Tempo implementadas na parte2.

2 – Implemente um método na classe Ligação para verificar se um dado número faz parte na ligação. Ou seja, o método deve verificar se o número informado é a origem ou o destino da ligação, ou mesmo se o número não existe nesta ligação.

3 – Implemente um método para calcular o valor da ligação. Considere que o valor da ligação vale R$1,00 por minuto.
OBS.: Divida as responsabilidades e implemente métodos nas classes apropriadas.

4 – Implemente um novo método para calcular o valor da ligação. De forma semelhante ao item 3, considere que o valor da ligação vale R$1,00 por minuto. Mas neste novo método, considere que será cobrado o valor do minuto mesmo que a ligação dure 20 segundos.
 
5 – Faça os testes necessários na classe Principal e compare os resultados.

*/

package roteiro6.parte3;

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
    
    public Tempo diferencaEmTempo(Tempo outroTempo) {
        Tempo duracaoEmTempo = new Tempo(0, 0, 0);
        int diferencaSegundos = this.segundo - outroTempo.getSegundo();
        int diferencaMinutos = this.minuto - outroTempo.getMinuto();
        int diferencaHoras = this.hora - outroTempo.getHora();

        if (diferencaSegundos < 0) {
            diferencaSegundos += 60;
            diferencaMinutos--;
        }

        if (diferencaMinutos < 0) {
            diferencaMinutos += 60;
            diferencaHoras--;
        }

        if (diferencaHoras < 0) {
            diferencaHoras += 24;
        }

        duracaoEmTempo.setSegundo(diferencaSegundos);
        duracaoEmTempo.setMinuto(diferencaMinutos);
        duracaoEmTempo.setHora(diferencaHoras);
        
        return duracaoEmTempo;
    }
}
