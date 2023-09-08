package lista_composicao_sobrecarga_e_estruturasDeRepeticao.exercicio1;

public class Condutor {

    private String nome;
    private int identificacao;
    private CarteiraMotorista carteira;

    public Condutor(String nome, int identificacao, CarteiraMotorista carteira){
        this.nome = nome;
        this. identificacao = identificacao;
        this.carteira = carteira;
    }
    public Condutor(String nome, int identificacao, int numero, boolean isAtiva, char categoria, int pontos){
        this.nome = nome;
        this.identificacao = identificacao;
        this.carteira = new CarteiraMotorista(numero, isAtiva, categoria, pontos);
    }

    public Condutor(String nome, int identificacao){
        this.nome = nome;
        this.identificacao = identificacao;
        this.carteira = null;
    }

    public void setCategoria(char novaCategoria){
        if(this.carteira.categoria == novaCategoria ){
            System.out.println("A categoria inserida já é a categoria do condutor");
        }else{
            this.carteira.categoria = novaCategoria;
            System.out.println("Categoria trocada." );
        }
    }

    public void adicionaPontos(int pontos){
        this.carteira.pontos += pontos;
        System.out.println("Pontos adicionados com sucesso.");
    }

    public int getPontos(){
        return this.carteira.pontos;
    }

    public void isCancelada(){
        if(this.carteira.pontos >= 30){
            this.carteira.isAtiva = false;
            System.out.println("Carteira está cancelada com " + this.carteira.pontos + "pontos.");
        }
    }
}
