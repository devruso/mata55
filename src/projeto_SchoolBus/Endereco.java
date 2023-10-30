package projeto_SchoolBus;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;

    public Endereco(String rua, int numero, String complemento, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }
    public String apresentarDados(){
        return "\nRua: " + this.rua + "\nNúmero: "+this.numero + "\nComplemento: " + this.complemento + "\nBairro: " + this.bairro;
    }
}
