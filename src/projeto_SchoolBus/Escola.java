package projeto_SchoolBus;

import java.util.ArrayList;

public class Escola
{
    private String nome;
    private Endereco endereco;
    private int telefone;
    private int cnpj;
    private ArrayList<Aluno> alunos;

    public Escola(String nome, Endereco endereco, int telefone, int cnpj)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
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
            System.out.println(aluno.getCpf());
            System.out.println(aluno.getSerie());
        }
    }


}
