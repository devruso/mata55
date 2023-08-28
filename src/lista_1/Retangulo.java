package lista_1;

public class Retangulo {

    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura){
        if(comprimento < 0 || largura < 0){
            System.out.print("Comprimento e largura devem ser maiores que 0");
        }else{
            this.comprimento = comprimento;
            this.largura = largura;
        }
    }

    public float calculaPerimetro(float comprimento, float largura){
        return 2 * (comprimento + largura);
    }

    public float calculaArea(float comprimento, float largura){
        return (comprimento * largura);
    }
}
