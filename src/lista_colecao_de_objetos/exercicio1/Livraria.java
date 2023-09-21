package lista_colecao_de_objetos.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Livraria {

    private String nome;
    private String cnpj;
    private ArrayList<Livro> listaDeLivros;

    public Livraria(String nome, String cnpj, ArrayList<Livro> listaDeLivros ){
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaDeLivros = listaDeLivros;
    }

    public boolean vendaLivro(String titulo, int quantidade){
        for (int i = 0; i < listaDeLivros.size() ; i++) {
            if(this.listaDeLivros.get(i).equals(titulo)){
                if(this.listaDeLivros.get(i).getEstoque() < quantidade){
                    System.out.println(" Sem estoque,\n" +"deseja fazer pedido de novos exemplares?");
                    return false;
                }else{
                    System.out.println("Titulo: " + this.listaDeLivros.get(i).getTitulo());
                    System.out.println("Preco: " + this.listaDeLivros.get(i).getPreco());
                    System.out.println("Estoque: "+ this.listaDeLivros.get(i).getEstoque());
                    return true;
                }
            }
        }
        System.out.println("Titulo não faz parte do nosso catalogo");
        return false;
    }

    public boolean registraLivro(String titulo, int quantidade){
        for (Livro el : listaDeLivros) {
            int estoque = el.getEstoque();
            if (el.getTitulo().equals(titulo)) {
                el.setEstoque(estoque + quantidade);
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }
}
