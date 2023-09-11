package projeto_SchoolBus;

public class Aluno
{
    private String nome;
    private int cpf;
    private String nomePai;
    private String nomeMae;
    private String naturalidade;
    private int numeroTelefone;
    private String endereco;
    private Escola escola;
    private int matricula;
    private int serie;
    private String turno;
    private Rota rota;


    public Aluno(String nome, int cpf, String nomePai, String nomeMae, String naturalidade, int numeroTelefone, String endereco, Escola escola, int matricula, int serie, String turno, Rota rota)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
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
