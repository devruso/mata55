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
    private Escola escola;
    private Endereco endereco;
    private int matricula;
    private int serie;
    private String turno;
    private PontoDeParada pontoDeParada;


    public Aluno(String nome,String nome_civil, int cpf, Date data_nascimento,String nome_pai, String nome_mae, String naturalidade, String telefone, Endereco endereco , int matricula, int serie, String turno)
    {
        this.nome = nome;
        this.nome_civil = nome_civil;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public Endereco getEndereco(){
        return this.endereco;
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

    public PontoDeParada getPontoDeParada() {
        return pontoDeParada;
    }
}
