package exercicio_pontuado_1;

public class Beneficiario {

    private String nome;
    private int CPF;
    private int RG;
    private String tipoImovel;
    private int quantidadeMetros;
    private double renda;
    private double dividaIPTU;

    public Beneficiario(String nome, int RG){
        this.nome = nome;
        this.RG = RG;
        this.CPF = 0;
        this.tipoImovel = null;
        this.quantidadeMetros = 0;
        this.renda = 0;
        this.dividaIPTU = 0;
    }
    public Beneficiario(String nome, int CPF ,int RG, String tipoImovel, int quantidadeMetros, double renda, double dividaIPTU){
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.tipoImovel = tipoImovel;
        this.quantidadeMetros = quantidadeMetros;
        this.renda = renda;
        this.dividaIPTU = dividaIPTU;
    }

    public void completarCadastro(int CPF,String tipoImovel, int quantidadeMetros, double renda, double dividaIPTU){
        this.CPF = CPF;
        this.tipoImovel = tipoImovel;
        this.quantidadeMetros = quantidadeMetros;
        this.renda = renda;
        this.dividaIPTU = dividaIPTU;
    }

    public void completarCadastro(String tipoImovel, int quantidadeMetros){
        this.tipoImovel = tipoImovel;
        this.quantidadeMetros = quantidadeMetros;
    }

    public void completarCadastro(double renda, double dividaIPTU){
        this.renda = renda;
        this.dividaIPTU = dividaIPTU;
    }

    public void pagamentoDividaRenda(){

        if(this.renda != 0 && this.dividaIPTU != 0 && this.tipoImovel != null){
            if(this.renda <= 5000){
                this.dividaIPTU = this.dividaIPTU * 0.9;
                System.out.println(this.dividaIPTU);
            }else{
                this.dividaIPTU = this.dividaIPTU * 0.95;
                System.out.println(this.dividaIPTU);

            }
        }else{
            System.out.println("Necessário completar seu cadastro");
        }
    }

    public void pagamentoDividaTamanhoImovel(){
        if(this.renda != 0 && this.dividaIPTU != 0 && this.tipoImovel != null){
            int valorDoMetro = 10;
            this.dividaIPTU = this.quantidadeMetros * valorDoMetro;
            System.out.println(this.dividaIPTU);

        }else{
            System.out.println("Necessário completar seu cadastro");
        }
    }

}
