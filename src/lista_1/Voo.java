package lista_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Voo {

    private Date dataVoo;
    private SimpleDateFormat horaVoo;
    private int assentosLivres = 100;
    private static int numeroVoo = 0;

    public Voo(Date dataVoo, SimpleDateFormat horaVoo){
        this.dataVoo = dataVoo;
        this.horaVoo = horaVoo;
        numeroVoo++;

    }

    public int getVooNumber(){
        return numeroVoo;
    }

    private Date getDataVoo(){
        return dataVoo;
    }

    private boolean comprarPassagem(){
        if(this.assentosLivres <= 0){
            return false;
        }else{
            this.assentosLivres--;
            return true;
        }
    }



}
