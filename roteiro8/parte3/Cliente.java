package roteiro8.parte3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private int telefone;
    private List<Veiculo> veiculos;

    public int getCpf_cnpj(){
        return cpf_cnpj;
    }

    public void setCpf_cnpj(int cpf_cnpj){
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public Cliente() {
        veiculos = new ArrayList<>();
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

}