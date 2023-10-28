package lista_heranca.exercicio_pontuado;

import java.util.ArrayList;

public class AplicacaoLivraria {
    public String nome_da_livraria = "Livraria luz do sol";

    static void imprimirTitulos(){
        ArrayList<Livro> listaLivros = new ArrayList<>();
        ArrayList<Revista> listaRevistas = new ArrayList<>();

        listaLivros.forEach(e -> e.toString());
        listaRevistas.forEach(e -> e.toString());
    }



    public static void main(String[] args) {
        Livro livro = new Livro("The witcher", "O russo lá",
                "Sei nao", "um bruxão da pesada", 60.00);

        System.out.println(livro.toString());

        System.out.println(livro);
    }
}
