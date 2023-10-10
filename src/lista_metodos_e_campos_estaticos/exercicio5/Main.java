package lista_metodos_e_campos_estaticos.exercicio5;

public class Main {
    public static void main(String[] args) {
        int diasDeGestacaoDeElefanteIndiano = 624;
        int tempoDeGestacaoEmHoras, tempoDeGestacaoEmMinutos, tempoDeGestacaoEmSegundos;

        tempoDeGestacaoEmHoras = ConversaoDeUnidadesDeTempo.diaParaHora(diasDeGestacaoDeElefanteIndiano);
        tempoDeGestacaoEmMinutos = ConversaoDeUnidadesDeTempo.diaParaMinuto(diasDeGestacaoDeElefanteIndiano);
        tempoDeGestacaoEmSegundos = ConversaoDeUnidadesDeTempo.diaParaSegundo(diasDeGestacaoDeElefanteIndiano);

        System.out.println("Gestação em dias: " +diasDeGestacaoDeElefanteIndiano + " Gestação em horas: " + tempoDeGestacaoEmHoras);
        System.out.println("Gestação em minutos:" + tempoDeGestacaoEmMinutos + " Gestação em segundos: " + tempoDeGestacaoEmSegundos);

    }
}
