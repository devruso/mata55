package lista_colecao_de_objetos.exercicio2;

public class Funcionario {

    private String matrcuicula;
    private String departamento;
    private String nome;
    private String funcao;
    private double salarioBruto;
    private boolean ehTerceirizado;

    public Funcionario(String matrcuicula, String departamento, String nome, String funcao, double salarioBruto, boolean ehTerceirizado) {
        this.matrcuicula = matrcuicula;
        this.departamento = departamento;
        this.nome = nome;
        this.funcao = funcao;
        this.salarioBruto = salarioBruto;
        this.ehTerceirizado = ehTerceirizado;
    }

    public String getMatrcuicula() {
        return this.matrcuicula;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public boolean getEhTerceirizado() {
        return this.ehTerceirizado;
    }
}
