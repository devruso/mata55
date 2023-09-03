package lista_composicao_e_sobrecarga;

public class Contrato {
    private int numero;
    private double valorAluguel;
    private int totalMesesAluguel;
    private int prestacoesPagas;
    private int prestacoesAtrasadas;
    private int prestacoesParaDespejo;
    private boolean statusContrato;
    private Fiador fiador;

    public Contrato(int numero, double valorAluguel, int totalMesesAluguel, int prestacoesAtrasadas, int prestacoesPagas, int prestacoesParaDespejo, Fiador fiador){
        if(fiador.getRendaMensal() < 3 * valorAluguel ){
            throw  new Error("Fiador não tem renda suficiente.");
        }else{
            this.numero = numero;
            this.valorAluguel = valorAluguel;
            this.totalMesesAluguel = totalMesesAluguel;
            this.prestacoesAtrasadas = prestacoesAtrasadas;
            this.prestacoesPagas = prestacoesPagas;
            this.prestacoesParaDespejo = prestacoesParaDespejo;
            this.statusContrato = true;
            this.fiador = fiador;
        }
    }
    public Contrato(int numero, double valorAluguel, int totalMesesAluguel, int prestacoesAtrasadas, int prestacoesPagas, int prestacoesParaDespejo, String nome, String cpf, double rendaMensal){
        if(rendaMensal < 3 * valorAluguel){
            throw  new Error("Fiador não tem renda suficiente.");
        }else{
            Fiador fiador = new Fiador(nome, cpf, rendaMensal);
            this.numero = numero;
            this.valorAluguel = valorAluguel;
            this.totalMesesAluguel = totalMesesAluguel;
            this.prestacoesAtrasadas = prestacoesAtrasadas;
            this.prestacoesPagas = prestacoesPagas;
            this.prestacoesParaDespejo = prestacoesParaDespejo;
            this.statusContrato = true;
            this.fiador = fiador;
        }

    }

    public double prestacaoSemJuros(){
        return this.valorAluguel;
    }

    public double prestacaoComJuros(){
        return this.valorAluguel * 1.1;
    }

    public void pagarPrestacao(double valorPrestacao){
        if(valorPrestacao < this.valorAluguel){
            throw new Error("Valor insuficiente para pagamento da prestação");
        }else{
            this.prestacoesAtrasadas --;
            this.prestacoesPagas ++;
        }

    }

    public void ordemDeDespejo(){
        if(prestacoesParaDespejo == 0){
            if(totalMesesAluguel <= 6){
                throw new Error("Contratante com pouco tempo para finalização do contrato, não pode ser despejado.");
            }
            throw new Error("Limite de prestações atrasadas atingido.");
        }else{
              System.out.println("faltam" + this.prestacoesParaDespejo + "para ser despejado");
        }

    }

    public void setRendaFiador(Fiador fiador, double novaRenda){
        this.fiador.setRendaMensal(novaRenda);
    }

    public void setFiador(Fiador fiador){
        this.fiador = fiador;
    }

}
