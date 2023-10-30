package projeto_SchoolBus;

import java.util.Date;

public class Aluno extends PessoaFisica
{
    private Escola escola;
    private int matricula;
    private int serie;
    private String turno;
    private PontoDeParada pontoDeParada;

    public Aluno(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae,
                 String pai, String naturalidade, Date data_nascimento, Escola escola, int matricula, int serie, String turno, PontoDeParada pontoDeParada) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.escola = escola;
        this.matricula = matricula;
        this.serie = serie;
        this.turno = turno;
        this.pontoDeParada = pontoDeParada;
    }

    @Override
    public String apresentarDados(){
        return super.apresentarDados() + "\nEscola: " + this.escola + "\nMatricula : " + this.matricula + "\nSerie: " + this.serie
                + "\nTurno: " + this.turno + "\nPonto de parada: "  + this.pontoDeParada;
    }
    @Override
    public String verificarTipo(){
        return "Aluno";
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
