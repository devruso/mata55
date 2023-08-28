package lista_1;

public class Animal {

    private String tipo;
    private String nome;
    private int idade;

    public  Animal(String tipo, String nome, int idade){
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    private void calculaDieta(int dias, String tipo){
        if (tipo.equals("mamifero")){
            System.out.print("Um mamifero come " + (dias * 2) + "quilos por dia!");
        }else if(tipo.equals("ave")){
            System.out.print("Uma ave come "+ (dias / 10)  + " quilos por dia!");
        }else if(tipo.equals("anfibio")){
            System.out.print("Um anfibio come "+ (dias / 200)  + " quilos por dia!");
        }
    }

}
