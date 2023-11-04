package exercicio_pontuado_6;

abstract class Funcionario {
    private String nome;
    private double salario;
    private int horasExtras;

    protected Funcionario(String nome, double salario, int horasExtras){
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularINSS(){
        if(this.getSalario() <= 1400 ){
            return this.getSalario() * 0.1;
        } else if (this.getSalario() > 1400 && this.getSalario() <= 3000) {
            return this.getSalario() * 0.2;
        }else if(this.getSalario() > 3000 && this.getSalario() <= 5000){
            return this.getSalario() * 0.3;
        }else{
            return this.getSalario() * 0.4;
        }
    }

    public double calcularSalarioTotal() {
        return salario + (horasExtras * 20);
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getHorasExtras(){
        return this.horasExtras;
    }
}
