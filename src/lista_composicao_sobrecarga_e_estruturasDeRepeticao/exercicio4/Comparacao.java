package lista_composicao_sobrecarga_e_estruturasDeRepeticao.exercicio4;

public class Comparacao {

    private int valor;

    public Comparacao(int valor){
        this.valor = valor;
    }

    public boolean compararValor(int numero){
        return this.valor == numero;
    }

    public boolean compararDoisNumeros(int numero1, int numero2){
        return numero1 == numero2;
    }

    public boolean compararSeMenor(int numero){
        return numero < this.valor;
    }

    public boolean primeiroMaior(int numero1, int numero2){
        return numero1 > numero2;
    }
}
