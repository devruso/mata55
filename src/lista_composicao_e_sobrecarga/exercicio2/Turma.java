package lista_composicao_e_sobrecarga.exercicio2;

public class Turma {

    private Disciplina disciplina;
    private  String horario;
    private int semestre;
    private int capacidade_total_alunos;
    private int alunos_matriculados;

    public Turma(String horario, int semestre, int capacidade_total_alunos, int alunos_matriculados){
        this.horario = horario;
        this.semestre = semestre;
        this.capacidade_total_alunos = capacidade_total_alunos;
        this.alunos_matriculados = alunos_matriculados;
    }
    public  Turma(Disciplina disciplina, String horario, int semestre, int capacidade_total_alunos, int alunos_matriculados){
        this.disciplina = disciplina;
        this.horario = horario;
        this.semestre = semestre;
        this.capacidade_total_alunos = capacidade_total_alunos;
        this.alunos_matriculados = alunos_matriculados;
    }

}
