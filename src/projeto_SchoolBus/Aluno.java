package projeto_SchoolBus;

public class Aluno
{
    private String nome;
    private int cpf;
    private String nome_pai;
    private String nome_mae;
    private String naturalidade;
    private int numeroTelefone;
    private String endereco;
    private Escola escola;
    private int matricula;
    private int serie;
    private String turno;
    private Rota rota;


    public Aluno(String nome, int cpf, String nome_pai, String nome_mae, String naturalidade, int numeroTelefone, String endereco, Escola escola, int matricula, int serie, String turno, Rota rota)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.naturalidade = naturalidade;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
        this.escola = escola;
        this.matricula = matricula;
        this.serie = serie;
        this.turno = turno;
        this.rota = rota;

    }

}
