package projeto_SchoolBus;

import java.util.ArrayList;

public class Escola extends PessoaJuridica
{
    private ArrayList<Aluno> alunos;

    public Escola(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia,
                  int num_funcionario,ArrayList<Aluno> alunos){
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome_fantasia, num_funcionario);
        this.alunos = alunos;
    }

    @Override
    public String apresentarDados(){
        return super.apresentarDados() + "\nAlunos: " + this.alunos;
    }
    @Override
    public String verificarTipo(){
        return "Escola";
    }
    public void matricularAluno(Aluno aluno){
        if(!this.alunos.contains(aluno)){
            this.alunos.add(aluno);
            System.out.println("Aluno cadastrado.");
        }else{
            System.out.println("Aluno já cadastrado.");
        }
    }

    public void exibirAlunos(){
        for (Aluno aluno: this.alunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getMatricula());
            System.out.println(aluno.getCpf_cnpj());
            System.out.println(aluno.getSerie());
        }
    }


}
