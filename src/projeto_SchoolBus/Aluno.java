package projeto_SchoolBus;

import java.util.Date;

public class Aluno
{
    private String nome;
    private String nome_civil;
    private String cpf;
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


    public Aluno(String nome,String nome_civil, String cpf, Date data_nascimento,String nome_pai, String nome_mae,
                 String naturalidade, String telefone, Endereco endereco , int matricula, int serie, String turno)
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

    public Aluno(String nome, String nome_civil, String cpf, Date data_nascimento, String nome_pai, String nome_mae,
                 String naturalidade, String telefone, Escola escola,String rua, String bairro,
                 int numero_casa, String complemento,
                 Endereco endereco, int matricula, int serie, String turno) {

        this.nome = nome;
        this.nome_civil = nome_civil;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.escola = escola;
        this.endereco = new Endereco(rua, numero_casa, complemento, bairro);
        this.matricula = matricula;
        this.serie = serie;
        this.turno = turno;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNome_civil() {
        return this.nome_civil;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public String getNome_pai() {
        return this.nome_pai;
    }

    public String getNome_mae() {
        return this.nome_mae;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int getSerie() {
        return this.serie;
    }

    public String getTurno() {
        return this.turno;
    }

    public PontoDeParada getPontoDeParada() {
        return this.pontoDeParada;
    }
}
