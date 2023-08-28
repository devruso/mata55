package lista_1;

public class Automovel {

    private String combustivel;
    private String fabricante;
    private int ano;
    private String modelo;

    public Automovel(String combustivel, String fabricante, int ano,  String modelo){
        this.combustivel = combustivel;
        this.fabricante = fabricante;
        this.ano = ano;
        this.modelo = modelo;
    }

    public int percorrePercurso(String combustivel, int litros){
        if(combustivel.equals("alcool")){
            return litros * 15;
        }else if(combustivel.equals("gasolina")){
            return litros * 12;
        }else{
            return ( litros/2) * 12 + (litros/2) * 15;
        }
    }


}