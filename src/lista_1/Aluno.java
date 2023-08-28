package lista_1;

import java.util.Calendar;
import java.util.Date;

public class Aluno {

    private String nome;
    private Date anoIngresso;
    private String curso;
    private int disciplinasAprovadas;

    public Aluno(String nome, Date anoIngresso, String curso, int disciplinasAprovadas){
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.disciplinasAprovadas = disciplinasAprovadas;
    }

    private int getCreditos(){
        return this.disciplinasAprovadas * 4;
    }

    private int getAnosRestantes(){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.setTime(this.anoIngresso);
        calendar.add(Calendar.YEAR,7);

        Date dataJubilamento = calendar.getTime();
        Date dataAtual = new Date();
        calendar.setTime(dataAtual);

        int anoAtual = calendar.get(Calendar.YEAR);
        calendar.setTime(dataJubilamento);
        int anoJubilamento = calendar.get(Calendar.YEAR);

        int anosRestantes = anoJubilamento - anoAtual;

        return anosRestantes;
    }





}
