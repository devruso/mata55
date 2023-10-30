package projeto_SchoolBus;

import java.util.ArrayList;

public class PontoDeParada
{
    static int id;
    private String nome;
    private double latitude;
    private double longitude;
    private ArrayList<Aluno> alunos;
    private static int totalDeParadas = 0;

    public PontoDeParada(String nome, double latitude, double longitude, ArrayList<Aluno> alunos) {
        PontoDeParada.id++;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alunos = alunos;
        totalDeParadas++;
    }
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public static int getTotalDeParadas(){
        return totalDeParadas;
    }


}
