package lista_composicao_sobrecarga_e_estruturasDeRepeticao.exercicio3;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void comprarIngresso(String dia_semana){
        if(this.idade <= 14 || this.idade >= 65 || dia_semana.equals("quarta-feira") || dia_semana.equals("quinta_feira")){
            System.out.println("Meia entrada disponível, valor do ingresso: R$ 8,00");
        }else{
            System.out.println("Meia entrada indisponível, valor do ingresso: R$ 16,00");

        }
    }

}
