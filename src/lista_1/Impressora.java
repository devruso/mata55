package lista_1;

public class Impressora {

    private String fabricante;
    private String modelo;
    private int capacidadeImpressao;
    private String tecnologia;// jato, tinta ou laser
    private int velocidade;


    public Impressora(String fabricante, String modelo, int capacidadeImpressao, String tecnologia, int velocidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadeImpressao = capacidadeImpressao;
        this.tecnologia = tecnologia;
        this.velocidade = velocidade;
    }


    public void tempoImpressao(int numeroPaginas) {
        this.capacidadeImpressao -= numeroPaginas;
        numeroPaginas = numeroPaginas * 30;
        if (numeroPaginas > 100)
            System.out.println("Faltam " + numeroPaginas / 60 + "segundos");
        else
            System.out.println("Faltam" + numeroPaginas + "segundos");
    }

    public void imprimeTexto(String texto) {
        System.out.println(texto);
    }

}
