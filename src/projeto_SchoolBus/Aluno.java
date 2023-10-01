package projeto_SchoolBus;

import java.util.Date;

public class Aluno
{
    private String nome;
    private String nome_civil;
    private int cpf;
    private Date data_nascimento;
    private String nome_pai;
    private String nome_mae;
    private String naturalidade;
    private String telefone;
    private String rua;
    private int numero_casa;
    private String complemento;
    private String bairro;
    private Escola escola;
    private int matricula;
    private int serie;
    private String turno;
    private Rota rota;


    public Aluno(String nome,String nome_civil, int cpf, Date data_nascimento,String nome_pai, String nome_mae, String naturalidade, String telefone, String rua, String complemento, int numero_casa, String bairro,  int matricula, int serie, String turno)
    {
        this.nome = nome;
        this.nome_civil = nome_civil;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.rua = rua;
        this.numero_casa = numero_casa;
        this.complemento = complemento;
        this.bairro = bairro;
        this.matricula = matricula;
        this.serie = serie;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public String getNome_civil() {
        return nome_civil;
    }

    public int getCpf() {
        return cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public Escola getEscola() {
        return escola;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getSerie() {
        return serie;
    }

    public String getTurno() {
        return turno;
    }

    public Rota getRota() {
        return rota;
    }
}
