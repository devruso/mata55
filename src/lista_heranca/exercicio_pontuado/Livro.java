package lista_heranca.exercicio_pontuado;

public class Livro {

    String nome;
    String autor_principal;
    String editora;
    String resumo;
    double preco;

    public Livro(String nome, String autor_principal, String editora, String resumo, double preco) {
        this.nome = nome;
        this.autor_principal = autor_principal;
        this.editora = editora;
        this.resumo = resumo;
        this.preco = preco;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n Autor principal: " + this.autor_principal +
                "\n Editora: " + this.editora + "\n Resumo: " +this.resumo + "\n Preço: " +this.preco;
    }



}
