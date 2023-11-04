package exercicio_pontuado_6;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    static ArrayList<Caixa> caixas = new ArrayList<>();
    static ArrayList<Empacotador> empacotadores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void listagemCaixas() {
        double totalSalarioCaixas = 0;
        double totalINSSCaixas = 0;
        System.out.println("Listagem de Caixas:");
        for (Caixa caixa : caixas) {
            double salarioTotal = caixa.calcularSalarioTotal();
            double inss = caixa.calcularINSS();
            totalSalarioCaixas += salarioTotal;
            totalINSSCaixas += inss;
            System.out.println("Nome: " + caixa.getNome());
            System.out.println("Salário Bruto: " + caixa.getSalario());
            System.out.println("Total de Horas Extras: " + caixa.getHorasExtras());
            System.out.println("Salário Total: " + salarioTotal);
            System.out.println("INSS a ser recolhido: " + inss);
        }
        System.out.println("Total de Salário Final dos Caixas: " + totalSalarioCaixas);
        System.out.println("Total de INSS a ser recolhido dos Caixas: " + totalINSSCaixas);

    }
    public static void listagemEmpacotadores() {
        double totalSalarioEmpacotadores = 0;
        double totalINSSEmpacotadores = 0;
        System.out.println("Listagem de Empacotadores:");
        for (Empacotador empacotador : empacotadores) {
            double salarioTotal = empacotador.calcularSalarioTotal();
            double inss = empacotador.calcularINSS();
            totalSalarioEmpacotadores += salarioTotal;
            totalINSSEmpacotadores += inss;
            System.out.println("Nome: " + empacotador.getNome());
            System.out.println("Salário Bruto: " + empacotador.getSalario());
            System.out.println("Salário Total: " + salarioTotal);
            System.out.println("INSS a ser recolhido: " + inss);
        }
        System.out.println("Total de Salário Final dos Empacotadores: " + totalSalarioEmpacotadores);
        System.out.println("Total de INSS a ser recolhido dos Empacotadores: " + totalINSSEmpacotadores);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Caixa");
            System.out.println("2. Adicionar Empacotador");
            System.out.println("3. Listar Caixas");
            System.out.println("4. Listar Empacotadores");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do Caixa: ");
                    String nomeCaixa = scanner.next();
                    System.out.print("Salário do Caixa: ");
                    double salarioCaixa = scanner.nextDouble();
                    System.out.print("Horas Extras do Caixa: ");
                    int horasExtrasCaixa = scanner.nextInt();
                    Caixa novoCaixa = new Caixa(nomeCaixa, salarioCaixa, horasExtrasCaixa);
                    caixas.add(novoCaixa);
                    System.out.println("Caixa adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do Empacotador: ");
                    String nomeEmpacotador = scanner.next();
                    System.out.print("Salário do Empacotador: ");
                    double salarioEmpacotador = scanner.nextDouble();
                    System.out.print("Horas Extras do Empacotador: ");
                    int horasExtrasEmpacotador = scanner.nextInt();
                    System.out.print("Adicional de Deficiência do Empacotador: ");
                    Empacotador novoEmpacotador = new Empacotador(nomeEmpacotador, salarioEmpacotador, horasExtrasEmpacotador);
                    empacotadores.add(novoEmpacotador);
                    System.out.println("Empacotador adicionado com sucesso!");
                    break;
                case 3:
                    listagemCaixas();
                    break;
                case 4:
                    listagemEmpacotadores();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
