package projeto_SchoolBus;

import java.util.ArrayList;

public class Rota {
    private static int id = 0;
    private ArrayList<PontoDeParada> pontosDeParada;
    private static int rotasCriadas = 0;

    public Rota(ArrayList<PontoDeParada> pontosDeParada){
        id++;
        rotasCriadas++;
        this.pontosDeParada = pontosDeParada;
    }

    public static int getRotasCriadas(){
        return rotasCriadas;
    }

    public int demandaTotal(){
        int total = 0;
        for (PontoDeParada ponto: this.pontosDeParada) {
            total++;
        }
        return total;
    }

}
