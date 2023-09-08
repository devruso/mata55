package lista_composicao_sobrecarga_e_estruturasDeRepeticao.exercicio2;

public class Fiador {

    protected String nome;
    protected int cpf;
    protected double renda;

    public Fiador(String nome, int cpf, double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
    }

    protected void setRenda(double renda){
        this.renda = renda;
    }

}
