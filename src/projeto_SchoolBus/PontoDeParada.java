package projeto_SchoolBus;

import java.util.ArrayList;

public class PontoDeParada
{
    private int id;
    private String nome;
    private double latitude;
    private double longitude;
    private ArrayList<Aluno> alunos;
    private static int totalDeParadas = 0;

    public PontoDeParada(int id, String nome, double latitude, double longitude, ArrayList<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alunos = alunos;
        totalDeParadas++;
    }

    public static int getTotalDeParadas(){
        return totalDeParadas;
    }


}
