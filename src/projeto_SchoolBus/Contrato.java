package projeto_SchoolBus;

import java.util.ArrayList;
import java.util.Date;

public class Contrato {

    private int num_contrato;
    private Date data_inicio;
    private Date data_fim;
    private double valor;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Veiculo> veiculos;



    public Contrato(int num_contrato, Date data_inicio, Date data_fim, double valor) {
        this.num_contrato = num_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
    }



}
