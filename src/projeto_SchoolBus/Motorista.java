package projeto_SchoolBus;

import java.util.ArrayList;
import java.util.Date;

public class Motorista
{
    private String nome_civil;
    private String nome;
    private int cpf_cnpj;
    private Date data_nascimento;
    private String rua;
    private String bairro;
    private int numero_casa;

    private String complemento;

    private String nome_pai;
    private String nome_mae;
    private String naturalidade;
    private int numero_contato;
    private char[] habilitacao;
    private String num_habilitacao;
    private boolean isTerceirizado;
    private ArrayList<Contrato> num_contrato;


    public Motorista(String nome_civil, String nome, int cpf_cnpj, String nome_pai, String nome_mae, String naturalidade, int numero_contato, String endereco, char[] habilitacao, Date data_nascimento, String rua, String bairro, int numero_casa, String complemento, String num_habilitacao)
    {
        this.nome_civil = nome_civil;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.rua = rua;
        this.bairro = bairro;
        this.numero_casa  = numero_casa;
        this.complemento = complemento;
        this.naturalidade = naturalidade;
        this.numero_contato = numero_contato;
        this.habilitacao = habilitacao;
        this.num_habilitacao = num_habilitacao;
        this.isTerceirizado = false;
        this.num_contrato = null;

    }

    public Motorista(String nome_civil, int cpf_cnpj, String nome_pai, String nome_mae, String naturalidade, int numero_contato, String endereco, char[] habilitacao,  ArrayList<Contrato>  num_contrato ,Date data_nascimento, String rua, String bairro, int numero_casa, String complemento, String num_habilitacao)
    {
        this.nome_civil = nome_civil;
        this.nome = nome_civil;
        this.cpf_cnpj = cpf_cnpj;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.rua = rua;
        this.bairro = bairro;
        this.numero_casa  = numero_casa;
        this.complemento = complemento;
        this.naturalidade = naturalidade;
        this.numero_contato = numero_contato;
        this.habilitacao = habilitacao;
        this.num_habilitacao = num_habilitacao;
        this.isTerceirizado = true;
        this.num_contrato = num_contrato;
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
