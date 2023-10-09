package lista_metodos_e_campos_estaticos.exercicio1;

public class Main {
    public static void main(String[]args){
        int areaEmMetrosQuadrados = 8250;

        double AreaEmPesQuadrados, AreaEmAcres, AreaEmCentimetrosQuadrados;

        AreaEmPesQuadrados = ConversaoDeUnidadesDeArea.metroQuadradoParaPesQuadrados(areaEmMetrosQuadrados);
        AreaEmAcres = ConversaoDeUnidadesDeArea.metroQuadradoParaAcre(areaEmMetrosQuadrados);
        AreaEmCentimetrosQuadrados = ConversaoDeUnidadesDeArea.metroQuadradoParaCentimetroQuadrado(areaEmMetrosQuadrados);

        System.out.println("  area em pés quadrados: " + AreaEmPesQuadrados + "  area em acres: " + AreaEmAcres + " area em centimetros quadrados " + AreaEmCentimetrosQuadrados);
    }
}
