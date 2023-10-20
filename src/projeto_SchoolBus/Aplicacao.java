package projeto_SchoolBus;

import java.util.Scanner;

public class Aplicacao {
    static void menuSchoolBus(){
        System.out.println("Bem vindo ao menu School Bus");
        System.out.println("1. Criar Endereco");
        System.out.println("2. Criar Aluno");
        System.out.println("3. Criar Motorista");
        System.out.println("4. Criar Contrato");
        System.out.println("5. Criar Escola");
        System.out.println("6. Criar Veículo");
        System.out.println("7. Criar Ponto de Parada");
        System.out.println("8. Criar Nova Rota");
        System.out.println("9. Calcular Demanda de Rota");
        System.out.println("10. Exibir Total de Rotas Criadas");
        System.out.println("11. Exibir Total de Pontos de Parada Criados");
        System.out.println("12. Sair da aplicacao");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Instancias que podem ser utilizadas durante a aplicacao
        Endereco enderecoDoCliente;
        Aluno aluno;
        Motorista motorista;
        Contrato contrato;
        Escola escola;
        Veiculo veiculo;
        PontoDeParada pontoDeParada;

        int opcao;

        do{
            menuSchoolBus();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    String rua;
                    int numero;
                    String complemento;
                    String bairro;
                    // Por algum motivo quando poe um inteiro tem que ler uma linha dps
                    System.out.println("Insira a rua:");
                    rua = sc.nextLine();
                    System.out.println("Insira o número:");
                    numero = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha
                    System.out.println("Insira o complemento:");
                    complemento = sc.nextLine();
                    System.out.println("Insira o bairro:");
                    bairro = sc.nextLine();
                    enderecoDoCliente = new Endereco(rua, numero, complemento, bairro);
                case 2:


            }
        }while(opcao != 12);




    }
}
