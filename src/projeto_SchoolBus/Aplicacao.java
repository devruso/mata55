package projeto_SchoolBus;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Bem vindo ao menu School Bus");
            System.out.println("1Criar Endereco");
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
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println();
            }
        }while(opcao != 12);




    }
}
