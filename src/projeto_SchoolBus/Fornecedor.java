package projeto_SchoolBus;

import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {

    private ArrayList<Contrato> contratos;

    public Fornecedor(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario,
                      ArrayList<Contrato> contratos) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome_fantasia, num_funcionario);
        this.contratos = contratos;
    }
}
