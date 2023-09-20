/*

1 – Crie o pacote roteiro6.parte3 com a cópia das classes Principal, Ligacao e Tempo implementadas na parte2.

2 – Implemente um método na classe Ligação para verificar se um dado número faz parte na ligação. Ou seja, o método deve verificar se o número informado é a origem ou o destino da ligação, ou mesmo se o número não existe nesta ligação.

3 – Implemente um método para calcular o valor da ligação. Considere que o valor da ligação vale R$1,00 por minuto.
OBS.: Divida as responsabilidades e implemente métodos nas classes apropriadas.

4 – Implemente um novo método para calcular o valor da ligação. De forma semelhante ao item 3, considere que o valor da ligação vale R$1,00 por minuto. Mas neste novo método, considere que será cobrado o valor do minuto mesmo que a ligação dure 20 segundos.
 
5 – Faça os testes necessários na classe Principal e compare os resultados.

*/

package roteiro6.parte3;

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
    
    public boolean verificaNumero(String numero) {
        if (numero.equals(numOrigem) || numero.equals(numDestino)) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calcularValorLigacao() {
        Tempo duracao = horaFim.diferencaEmTempo(horaInicio);
        return duracao.getHora() * 60 + duracao.getMinuto() + duracao.getSegundo() / 60;
    }

    public double calcularValorLigacaoComCobrancaMinima() {
        Tempo duracao = horaFim.diferencaEmTempo(horaInicio);
        if (duracao.getSegundo() > 0) {
            return duracao.getHora() * 60 + duracao.getMinuto() + 1;
        } else {
            return duracao.getHora() * 60 + duracao.getMinuto();
        }
    }

}

