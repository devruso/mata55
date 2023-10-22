package lista_heranca.exercicio_pontuado;

public class LivroDidatico extends Livro{

    String area;


    public LivroDidatico(String nome, String autor_principal, String editora, String resumo, String area, double preco) {
        super(nome, autor_principal, editora, resumo, preco);
        this.area = area;
    }

    public String toString(){
       return super.toString() + "\n Area: " + this.area;
    }

}
