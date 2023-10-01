package lista_colecao_de_objetos.exercicio2;

import java.util.ArrayList;

public class Pessoal {

    private ArrayList<Funcionario> funcionarios;
    private String nome;

    public Pessoal(ArrayList<Funcionario> funcionarios, String nome) {
        this.funcionarios = funcionarios;
        this.nome = nome;
    }

    public void admiteFuncionario(Funcionario candidato){
        if(!this.funcionarios.contains(candidato)){
            this.funcionarios.add(candidato);
            System.out.println("Funcionario adicionado.");
        }else{
            System.out.println("Funcionario ja cadastrado.");
        }
    }

    public void imprimirFolhaDePagamento() {
        System.out.println("Folha de Pagamento para " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            double salarioBruto = funcionario.getSalarioBruto();
            double desconto = funcionario.getEhTerceirizado() ? 0.08 : 0.10;
            double salarioLiquido = salarioBruto - (salarioBruto * desconto);

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Departamento: " + funcionario.getDepartamento());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.println("Terceirizado: " + (funcionario.getEhTerceirizado() ? "Sim" : "Não"));
            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Salário Líquido: " + salarioLiquido);
        }
    }
    public double ValorBrutoFolha(){
        double valorAcumulado = 0.0;
        for (Funcionario funcionario : this.funcionarios) {
            valorAcumulado += funcionario.getSalarioBruto();
        }
        return valorAcumulado;
    }

    public Funcionario funcionarioComMaiorSalario(){
        Funcionario funcionarioComMaiorSalario = null;
        for (int i = 0; i<this.funcionarios.size(); i++) {
            if(i == 0 || this.funcionarios.get(i).getSalarioBruto() > funcionarioComMaiorSalario.getSalarioBruto()){
                funcionarioComMaiorSalario = this.funcionarios.get(i);
            }
        }
        return funcionarioComMaiorSalario;
    }

    public void listarFuncionariosPorDepartamento(String departamento){
        for (Funcionario funcionario : this.funcionarios) {
            if(funcionario.getDepartamento().equals(departamento)){
                System.out.println("Departamento: " + funcionario.getDepartamento());
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Função: " + funcionario.getFuncao());
                System.out.println("Terceirizado: " + (funcionario.getEhTerceirizado() ? "Sim" : "Não"));
            }
        }
    }

}
