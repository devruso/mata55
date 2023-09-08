package lista_composicao_e_sobrecarga.exercicio3;

public class CartaoDeMensagem {

    private Destinatario destinatario;
    private String emissor;
    private String mensagem;
    private String horario_entrega;
    private double custo;

    public  CartaoDeMensagem(Destinatario destinatario, String emissor, String mensagem, String horario_entrega, double custo ){
        this.destinatario = destinatario;
        this.emissor = emissor;
        this.mensagem = mensagem;
        this.horario_entrega = horario_entrega;
        this.custo = custo;
    }

    public  CartaoDeMensagem(Destinatario destinatario, String emissor, String mensagem, double custo){
        this(destinatario, emissor, mensagem, "0000",custo );
    }



    public  CartaoDeMensagem(String nomeDestinatario, String enderecoDestinatario, String emissor, String mensagem, String horario_entrega, double custo ){
        this.destinatario = new Destinatario(nomeDestinatario, enderecoDestinatario);
        this.emissor = emissor;
        this.mensagem = mensagem;
        this.custo = custo;
        this.horario_entrega = horario_entrega;
    }



}
