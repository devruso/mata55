package projeto_SchoolBus;

import java.util.ArrayList;
import java.util.Date;

public class Motorista extends PessoaFisica
{
    private char[] habilitacao;
    private String num_habilitacao;
    private boolean isTerceirizado;
    private ArrayList<Contrato> num_contrato;

    public Motorista(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae,
                     String pai, String naturalidade, Date data_nascimento, char[] habilitacao, String num_habilitacao,
                     boolean isTerceirizado, ArrayList<Contrato> num_contrato) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.habilitacao = habilitacao;
        this.num_habilitacao = num_habilitacao;
        this.isTerceirizado = isTerceirizado;
        this.num_contrato = num_contrato;
    }

    @Override
    public String apresentarDados(){
        return super.apresentarDados() + "\nHabilitacão (oes): " + this.habilitacao + "\nNúmero da habilitação: "+ this.num_habilitacao +
                "\nProfissional terceirizado: "+this.isTerceirizado + "\nNumeros de contrato: " + this.num_contrato;
    }

    public boolean isTerceirizado() {
        return isTerceirizado;
    }

    public void setNum_contrato(ArrayList<Contrato>  num_contrato){
        if(this.isTerceirizado){
            this.num_contrato = num_contrato;
        }else{
            throw new Error("Método inválido.");
        }
    }
}
