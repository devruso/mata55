package projeto_SchoolBus;

import java.util.Date;

public class PessoaFisica extends Pessoa {

    private String nome;
    private String mae;
    private String pai;
    private String naturalidade;
    private Date data_nascimento;

    public PessoaFisica(
            String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone,
            String nome, String mae, String pai, String naturalidade, Date data_nascimento
    ){
        super(nome_oficial, cpf_cnpj, endereco, telefone);
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.data_nascimento = data_nascimento;
    }




}
