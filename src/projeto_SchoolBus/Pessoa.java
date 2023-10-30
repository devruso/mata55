package projeto_SchoolBus;

public class Pessoa {

    private String nome_oficial;
    private String cpf_cnpj;
    private Endereco endereco;
    private String telefone;

    public Pessoa(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone) {
        this.nome_oficial = nome_oficial;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    protected String getNome_oficial(){
        return this.nome_oficial;
    }

    protected String getCpf_cnpj(){
        return this.cpf_cnpj;
    }

    protected String apresentarDados(){
        return "Nome oficial: " + this.nome_oficial + "\nCPF: " + this.cpf_cnpj + "\nEndereco: " + this.endereco + "\nTelefone: " + this.telefone;
    }
    protected String verificarTipo(){
        return "Pessoa";
    }


}
