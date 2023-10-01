package projeto_SchoolBus;

public class Veiculo
{
    private String placa;
    private int ano;
    private String modelo;
    private int capacidade;
    private boolean isAlugado;
    private Contrato contrato;


    public Veiculo(String placa, int ano,String modelo, int capacidade, boolean isAlugado, Contrato contrato)
    {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.isAlugado = isAlugado;
        this.contrato = contrato;
    }

    public boolean isAlugado()
    {
    return this.isAlugado;
    }
    public void setcontrato(Contrato contrato)
    {
        if(this.isAlugado){
            this.contrato = contrato;
        }else{
            throw new Error("Método inválido.");
        }
}

}
