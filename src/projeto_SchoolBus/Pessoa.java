package projeto_SchoolBus;

public class Pessoa {

    private String nome_oficial;
    private String cpf_cnpj;
    private Endereco endereco;
    private String telefone;


    protected String getNome_oficial(){
        return this.nome_oficial;
    }

    protected String getCpf_cnpj(){
        return this.cpf_cnpj;
    }

}
