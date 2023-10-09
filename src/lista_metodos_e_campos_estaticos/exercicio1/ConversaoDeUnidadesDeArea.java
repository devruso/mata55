package lista_metodos_e_campos_estaticos.exercicio1;

public class ConversaoDeUnidadesDeArea {

    static double metroQuadradoParaPesQuadrados(int n){
        return n * 10.76;
    }

    static double peQuadradoParaCentimetrosQuadrados(int n){
        return n * 929;
    }

    static double milhaQuadradaParaAcres(int n){
        return  n * 640;
    }

    static double acreParaPesQuadrados(int n){
        return n *  43_560;
    }

}
