package projeto_SchoolBus;

public class Veiculo
{
    private String placa;
    private int ano;
    private String modelo;
    private int capacidade;
    private boolean isAlugado;
    private int num_contrato;


    public Veiculo(String placa, int ano,String modelo, int capacidade, boolean isAlugado, int num_contrato)
    {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.isAlugado = isAlugado;
        this.num_contrato = num_contrato;
    }

    public boolean isAlugado()
    {
    return this.isAlugado;
    }
    public void setNum_contrato(int num_contrato)
    {
        if(this.isAlugado){
            this.num_contrato = num_contrato;
        }else{
            throw new Error("Método inválido.");
        }
}

}
