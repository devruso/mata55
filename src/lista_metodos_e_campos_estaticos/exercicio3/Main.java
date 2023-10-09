package lista_metodos_e_campos_estaticos.exercicio3;

public class Main {
    public static void main(String[] args) {
        int volumePiscinaOlimpicaEmMetrosCubicos = 1890;

        double volumeEmLitros, volumeEmPesCubicos, volumeEmCentimetrosCubicos;

        volumeEmLitros = ConversaoDeUnidadesDeVolume.metroCubicoParaLitro(volumePiscinaOlimpicaEmMetrosCubicos);
        volumeEmPesCubicos = ConversaoDeUnidadesDeVolume.metroCubicoParaPesCubico(volumePiscinaOlimpicaEmMetrosCubicos);
        volumeEmCentimetrosCubicos = ConversaoDeUnidadesDeVolume.litroParaCentimetroCubico(volumePiscinaOlimpicaEmMetrosCubicos);

        System.out.println("Volume em litros: " + volumeEmLitros + " Volume em pés cúbicos: " + volumeEmPesCubicos + " Volume em Centimetros Cúbicos: " + volumeEmCentimetrosCubicos);

    }
}
