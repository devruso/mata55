package lista_composicao_sobrecarga_e_estruturasDeRepeticao.exercicio2;

public class Contrato {

    private Fiador fiador;
    private int numero;
    private double valorAluguel;
    private int mesesTotais;
    private int prestacoesPagas;
    private int jurosPorAtraso;
    private int prestacoesAtrasadas;
    private int prestacoesParaDespejo = 6;
    private boolean isAtivo;

    public Contrato(Fiador fiador, int numero, double valorAluguel, int mesesTotais, int prestacoesPagas, int jurosPorAtraso){
        if (fiador.renda  * 3 < valorAluguel){
            throw new Error("Renda do fiador menor que 3 vezes o valor do aluguel.");
        }else{
            this.fiador = fiador;
            this.numero = numero;
            this.valorAluguel = valorAluguel;
            this.mesesTotais = mesesTotais;
            this.prestacoesPagas = prestacoesPagas;
            this.jurosPorAtraso = jurosPorAtraso;
            this.prestacoesAtrasadas = 0;
            this.isAtivo = true;
        }
    }

    public double getValorAluguel(){
        return this.valorAluguel;
    }

    public void setFiador(Fiador fiador){
        if(fiador.renda < this.valorAluguel * 3){
            throw new Error("Renda do fiador insuficinete.");
        }else{
            this.fiador = fiador;
        }
    }

    public double pagarPrestacaoAtrasada(double valor){
        if(valor < (this.valorAluguel * 0.1) + this.valorAluguel){
            throw new Error("Valor insuficiente para pagar prestacao atrasada");
        }else if(this.prestacoesAtrasadas == 0){
            throw new Error("Não há prestações atrasadas.");
        } else if (!this.isAtivo) {
            throw new Error("Contrato inativo.");
        } else{
            if(this.prestacoesAtrasadas > 0){
                this.prestacoesAtrasadas -= 1;
            }
            this.prestacoesPagas += 1;
            System.out.println("Prestacoes atrasadas restantes:" + this.prestacoesAtrasadas);
            System.out.println("Valor restante após pagamento de prestação:");
            return (valor - ((this.valorAluguel * 0.1) + this.valorAluguel));
        }
    }

    public void pagarPrestacaoSemJuros(double valorAluguel){
        if(valorAluguel < this.valorAluguel){
            throw new Error("Valor insuficiente");
        } else if (!this.isAtivo) {
            throw new Error("Contrato inativo.");
        } else{
            this.prestacoesPagas += 1;
            System.out.println("Pagamento efetuado");
        }
    }

    public void isDespejo(){
        if(this.prestacoesAtrasadas >= 6){
            if(this.prestacoesPagas >= this.mesesTotais - 6 ){
                System.out.println("Contrato próximo do fim. Ordem de despejo inviável.");
            }else{
                System.out.println("Limite de prestações atrasadas atingido. Ordem de despejo iniciada");
                isAtivo = false;
            }
        }else{
            System.out.println("Limite de prestações em atraso não foi atingido.");
            System.out.println("Prestações em atraso: " + this.prestacoesAtrasadas);
        }
    }




}
