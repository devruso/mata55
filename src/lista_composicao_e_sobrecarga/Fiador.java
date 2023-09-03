package lista_composicao_e_sobrecarga;

public class Fiador {
    private String nome;
    private String cpf;
    private double rendaMensal;

    public Fiador(String nome, String cpf, double rendaMensal){
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.nome=nome;
    }

    protected String getNome(){
        return this.nome;
    }
    protected String getCpf(){
        return this.cpf;
    }
    protected double getRendaMensal(){
        return this.rendaMensal;
    }
    protected void setRendaMensal(double rendaMensal){
        this.rendaMensal = rendaMensal;
    }


}
