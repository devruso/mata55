package lista_heranca.exercicio_pontuado;

public class aplicacaoLivraria {
    public String nome_da_livraria = "Livraria do milsinho";

    public static void main(String[] args) {
        Livro livro = new Livro("The witcher", "O russo lá",
                "Sei nao", "um bruxão da pesada", 60.00);

        System.out.println(livro.toString());

        System.out.println(livro);
    }
}
