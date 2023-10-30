package projeto_SchoolBus;

public class PessoaJuridica extends Pessoa {

    private String nome_fantasia;
    private int num_funcionario;


    public PessoaJuridica(
            String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone,
            String nome_fantasia, int num_funcionario
    ) {
        super(nome_oficial, cpf_cnpj, endereco, telefone);
        this.nome_fantasia = nome_fantasia;
        this.num_funcionario = num_funcionario;
    }

    public String getNome_fantasia(){
        return this.nome_fantasia;
    }

    public String getCNPJ(){
        return super.getCpf_cnpj();
    }

}
