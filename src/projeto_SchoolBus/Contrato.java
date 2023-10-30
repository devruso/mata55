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
    private Fornecedor fornecedor;



    public Contrato(int num_contrato, Date data_inicio, Date data_fim, double valor) {
        this.num_contrato = num_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
    }
    public void adicionaFornecedor(PessoaJuridica pessoa){
        if(pessoa instanceof Fornecedor){
            this.fornecedor = (Fornecedor) pessoa;
        }else{
            throw new Error("Só é possível criar contratos com fornecedor.");
        }
    }

    public void adicionaVeiculo(Veiculo veiculo){
        if (veiculo.isAlugado()){
            if(!this.veiculos.contains(veiculo)){
                this.veiculos.add(veiculo);
                System.out.println("Veiculo adicionado ao contrato.");
            }else{
                System.out.println("Veiculo já cadastrado.");
            }
        }else{
            System.out.println("Veiculo não está alugado");
        }
    }


    public void removeVeiculo(Veiculo veiculo){
        if (this.veiculos.contains(veiculo)){
            this.veiculos.remove(veiculo);
            System.out.println("Veiculo removido do contrato");
        }else{
            System.out.println("O veículo não está associado a este contrato.");

        }
    }

    public void adicionaMotorista(Motorista motorista){
        if (motorista.isTerceirizado()){
            if(!this.motoristas.contains(motorista)){
                this.motoristas.add(motorista);
                System.out.println("Motorista cadastrado.");
            }else{
                System.out.println("Motorista já cadastrado.");
            }
        }else {
            System.out.println("Motorista não é terceirizado.");
        }
    }

    public void removeMotorista(Motorista motorista){
        if(this.motoristas.contains(motorista)){
            this.motoristas.remove(motorista);
            System.out.println("Motorista removido.");
        }else{
            System.out.println("Motorista não cadastrado.");
        }
    }



}
