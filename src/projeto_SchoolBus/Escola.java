package projeto_SchoolBus;

import java.util.ArrayList;

public class Escola
{
    private String nome;
    private Endereco endereco;
    private int telefone;
    private int cnpj;
    private ArrayList<Escola> alunos;

    public Escola(String nome, Endereco endereco, int telefone, int cnpj)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
}
