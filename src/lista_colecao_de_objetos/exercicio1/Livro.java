package lista_colecao_de_objetos.exercicio1;

public class Livro {

     private String titulo;
     private String autor;
     private String  area;
     private double preco;
     private int estoque;

     public Livro(String titulo,String autor, String area, double preco){
          this.titulo = titulo;
          this.autor = autor;
          this.area = area;
          this.preco = preco;
          this.estoque = 0;
     }

     public Livro(String titulo,String autor,  double preco){
          this.titulo = titulo;
          this.autor = autor;
          this.area = "multidiscplinar";
          this.preco = preco;
          this.estoque = 0;
     }

     public String getTitulo(){
          return this.titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getAutor() {
          return autor;
     }

     public void setAutor(String autor) {
          this.autor = autor;
     }

     public String getArea() {
          return area;
     }

     public void setArea(String area) {
          this.area = area;
     }

     public double getPreco() {
          return preco;
     }

     public void setPreco(double preco) {
          this.preco = preco;
     }

     public int getEstoque() {
          return estoque;
     }

     public void setEstoque(int estoque) {
          this.estoque = estoque;
     }


}
