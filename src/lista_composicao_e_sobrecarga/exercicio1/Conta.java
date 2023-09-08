package lista_composicao_e_sobrecarga.exercicio1;

public class Conta {

    private Titular titular;
    private int numero;
    private int agencia;
    private boolean isEspecial = false;
    private double saldo;
    private double limite = 1000d;



    public Conta(Titular titular, int numero, int agencia){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.limite = 0;
    }

    public Conta(Titular titular, int numero, int agencia, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.isEspecial = true;
    }

    public void saque(double valor){
        if(valor > this.saldo && this.isEspecial){
            if(this.saldo + this.limite < valor){
                System.out.println("Saldo e limite insuficientes.");
            }else if(this.saldo + this.limite > valor){
                valor -= this.saldo;
                this.saldo = 0;
                this.limite -= valor;
                System.out.println("Saque efetuado usando o limite." );
                System.out.println("Limite restante: " + this.limite);
            }
        }else if(valor > this.saldo && !isEspecial){
            System.out.println("Saldo insuficiente.");
        }else{
             this.saldo -= valor;
             System.out.println("Saque efetuado.");
             System.out.println("Saldo restante: " + this.saldo);
        }
    }

}
