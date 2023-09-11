package projeto_SchoolBus;

public class Motorista
{
    private String nomeCivil;
    private String nomeSocial;
    private int cpf;
    private String nomePai;
    private String nomeMae;
    private String naturalidade;
    private int numeroContato;
    private String endereco;
    private char habilitacao;
    private boolean isTerceirizado;


    public Motorista(String nomeCivil, String nomeSocial, int cpf, String nomePai, String nomeMae, String naturalidade, int numeroContato, String endereco, char habilitacao, boolean isTerceirizado)
    {
        this.nomeCivil = nomeCivil;
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.naturalidade = naturalidade;
        this.numeroContato = numeroContato;
        this.endereco = endereco;
        this.habilitacao = habilitacao;
        this.isTerceirizado = isTerceirizado;

    }


}
