package lista_heranca.exercicio_pontuado;

public class Revista {

    String nome;
    String editora;
    String periodicidade;
    double preco;

    public Revista(String nome, String editora, String periodicidade, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.periodicidade = periodicidade;
        this.preco = preco;
    }

    public String toString(){
        return "Nome : "+ this.nome + "\n Editora: " + this.editora + "\n Periodicidade: " + this.periodicidade +
                "\n Preco: " + this.preco;
    }

    public String precoFinal(){
        int taxa = 10;

       return "Titulo: " + this.nome+ "\n Preco original: "+ this.preco +
                "\n Imposto de serviço:" + taxa +
                "\n Preço final: " + this.preco * ( 1 + taxa/ 100);
    }

}
