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

}
