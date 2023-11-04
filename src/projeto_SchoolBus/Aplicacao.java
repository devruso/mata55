package projeto_SchoolBus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {

    static Scanner sc = new Scanner(System.in);
    static int opcao;

    // Instancias que podem ser utilizadas durante a aplicacao
    static Endereco endereco;
    static Aluno aluno;
    static Motorista motorista;
    static Contrato contrato;
    static Fornecedor fornecedor;
    static Escola escola;
    static Veiculo veiculo;
    static PontoDeParada pontoDeParada;
    static Rota rota;

    static void menu(){
        System.out.println("Bem vindo ao menu School Bus\n");
        System.out.println("1. Criar Endereco");
        System.out.println("2. Criar Escola");
        System.out.println("3. Criar Ponto de Parada");
        System.out.println("4. Criar Aluno");
        System.out.println("5. Criar Motorista");
        System.out.println("6. Criar Contrato");
        System.out.println("7. Criar Fornecedor");
        System.out.println("8. Criar Veículo");
        System.out.println("9. Criar Nova Rota");
        System.out.println("10. Calcular Demanda de Rota");
        System.out.println("11. Exibir Total de Rotas Criadas");
        System.out.println("12. Exibir Total de Pontos de Parada Criados");
        System.out.println("13. Exibir Tipo de alguma Pessoa.");
        System.out.println("14. Exibir informações detalhas de alguma Pessoa");
        System.out.println("16. Sair da aplicacao\n");
    }
    static Endereco criaEndereco(){
        String rua;
        int numero;
        String complemento;
        String bairro;
        System.out.println("Criação de endereço. \n");
        System.out.println("Insira a rua:");
        rua = sc.nextLine();
        System.out.println("Insira o número:");
        numero = sc.nextInt();
        sc.nextLine(); //
        System.out.println("Insira o complemento:");
        complemento = sc.nextLine();
        System.out.println("Insira o bairro:");
        bairro = sc.nextLine();
        return endereco = new Endereco(rua,numero,complemento,bairro);
    }
    static Aluno criaAluno(){
        String nome;
        String nome_civil;
        String cpf;
        Date data_nascimento;
        String nome_pai;
        String nome_mae;
        String naturalidade;
        String telefone;
        int matricula;
        int serie;
        String turno;
        System.out.println("\nCadastro de um aluno");
        System.out.println("Insira o nome do aluno:");
        nome = sc.nextLine();
        System.out.println("Insira o nome civil/social do aluno:");
        nome_civil = sc.nextLine();
        System.out.println("Insira o CPF:");
        cpf = sc.nextLine();
        System.out.println("Insira a data de nascimento (no formato dd/mm/yyyy):");
        String dataNascimentoString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data_nascimento = sdf.parse(dataNascimentoString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Insira o nome do seu pai:");
        nome_pai = sc.nextLine();
        System.out.println("Insira o nome da sua mãe: ");
        nome_mae=sc.nextLine();
        System.out.println("Insira sua naturalidade:");
        naturalidade = sc.nextLine();
        System.out.println("Insira o telefone do aluno. Formato: XX XXXXX-XXXX");
        telefone = sc.nextLine();
        System.out.println("Insira a matricula do aluno");
        matricula = sc.nextInt();
        sc.nextLine();
        System.out.println("insira a série do aluno:");
        serie = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira do turno do aluno. Matutino ou Vespertino.");
        turno = sc.nextLine();
        if(endereco == null){
            endereco = criaEndereco();
        }
        if (escola == null){
            escola = criaEscola();
        }
        if(pontoDeParada == null){
            pontoDeParada = criaPontoDeParada();
        }
        aluno =  new Aluno(nome_civil, cpf, endereco,telefone,nome,nome_mae,nome_pai, naturalidade, data_nascimento,escola, matricula, serie, turno, pontoDeParada);
        escola.matricularAluno(aluno);
        pontoDeParada.adicionarAluno(aluno);
        return aluno;
    }
    static Motorista criaMotorista(){
        String nome;
        String nome_civil;
        Endereco endereco;
        String cpf_cnpj;
        String nome_pai;
        String nome_mae;
        String naturalidade;
        String numero_contato;
        char[] habilitacao;
        Date data_nascimento;
        String num_habilitacao;
        boolean terceirizado;
        ArrayList<Contrato> numero_contrato = new ArrayList<>();

        endereco = criaEndereco();
        System.out.println("Insira o nome social do motorista:");
        nome = sc.nextLine();
        System.out.println("Insira o nome civil do motorista:");
        nome_civil = sc.nextLine();
        System.out.println("Insira o cpf ou cnpj do motorista:");
        cpf_cnpj = sc.nextLine();
        System.out.println("Nome do pai do motorista:");
        nome_pai = sc.nextLine();
        System.out.println("Nome da mãe do motorista:");
        nome_mae = sc.nextLine();
        System.out.println("Naturalidade do motorista:");
        naturalidade = sc.nextLine();
        System.out.println("O motorista é terceirizado? Digite true ou false ");
        terceirizado = sc.nextBoolean();
        System.out.println("Digite o telefone o motorista");
        numero_contato = sc.nextLine();
        sc.nextLine();
        System.out.println("Carteira de habilitacao do motorista. Adicione o caractere.");
        habilitacao = sc.nextLine().toCharArray();
        System.out.println("Digite o número de habilitação do motorista");
        num_habilitacao = sc.nextLine();
        System.out.println("Insira sua data de nascimento no fomrato dd/MM/aaaa");
        String dataNascimentoString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data_nascimento = sdf.parse(dataNascimentoString);
        } catch (ParseException e) {
            throw new RuntimeException("Formato de data errado.");
        }
        if(contrato == null){numero_contrato.add(criaContrato());}else{numero_contrato.add(contrato);}
        return motorista = new Motorista(nome_civil,cpf_cnpj,endereco,numero_contato,nome,nome_mae,nome_pai,naturalidade,data_nascimento,habilitacao,num_habilitacao, terceirizado,numero_contrato);
    }
    static Contrato criaContrato(){
        int num_contrato;
        Date data_inicio;
        Date data_fim;
        double valor;
            System.out.println("Digite o numero do contrato:");
            num_contrato = sc.nextInt();
            sc.nextLine();
            System.out.println("Data de inicio do contrato. Use o formato dd/MM/aaaa");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataInicioString = sc.nextLine();
            try {
                data_inicio = sdf.parse(dataInicioString);
            } catch (ParseException e) {
                throw new RuntimeException("Formato de data inválido.");
            }
            System.out.println("Data de finalização do contrato. Use o formato dd/MM/aaaa");

            String dataFimString = sc.nextLine();
            try{
                data_fim = sdf.parse(dataFimString);
            }catch (ParseException e){
                throw new RuntimeException("Formato de data inválido");
            }
            System.out.println("Digite o valor do contrato:");
            valor = sc.nextDouble();
            sc.nextLine();
            if(fornecedor == null) criaFornecedor();
            contrato =  new Contrato(num_contrato,data_inicio,data_fim,valor, fornecedor);
            fornecedor.adicionaContrato(contrato);
            return contrato;
    }
    static Fornecedor criaFornecedor(){
        String nome_oficial;
        String cpf_cnpj;
        String telefone;
        String nome_fantasia;
        int num_funcionario;
        ArrayList<Contrato> contratos = new ArrayList<>();
        System.out.println("\nCriação de fornecedor.");
        System.out.println("Insira o nome cívil do fornecedor: ");
        nome_oficial = sc.nextLine();
        System.out.println("Insira o CNPJ do fornecedor: ");
        cpf_cnpj = sc.nextLine();
        if (endereco == null) criaEndereco();
        System.out.println("Insira o telefone do fornecedor (XX) XXXXX-XXXX");
        telefone = sc.nextLine();
        System.out.println("Insira o nome da empresa do fornecedor: ");
        nome_fantasia = sc.nextLine();
        System.out.println("Insira o número de funcionários da empresa:");
        num_funcionario = sc.nextInt();
        return fornecedor = new Fornecedor(nome_oficial,cpf_cnpj,endereco,telefone,nome_fantasia,num_funcionario,contratos);
    }
    static Escola criaEscola(){
        String nome;
        String telefone;
        String cnpj;
        String nome_fantasia;
        int num_funcionarios;
        ArrayList<Aluno> alunos = new ArrayList<>();
        System.out.println("\nCriação de  uma escola. \n");
        System.out.println("Insira o nome jurídico da escola: ");
        nome = sc.nextLine();
        System.out.println("Insira o numero de telefone da escola. Padrão (XX) XXXXX-XXXX");
        telefone = sc.nextLine();
        System.out.println("Digite o cnpj da escola:");
        cnpj = sc.nextLine();
        System.out.println("Digite o nome fictício da escola: ");
        nome_fantasia = sc.nextLine();
        System.out.println("Digite o numero de funcionarios: ");
        num_funcionarios = sc.nextInt();
        if(endereco == null) criaEndereco();
        return escola =  new Escola(nome,cnpj,endereco,telefone,nome_fantasia,num_funcionarios,alunos);
    }
    static Veiculo criaVeiculo(){
        String placa;
        int ano;
        String modelo;
        int capacidade;
        boolean isAlugado;
        System.out.println("Criação de veículo.\n");
            if(contrato == null) criaContrato();
            sc.nextLine();
            System.out.println("Digite a placa do veiculo: ");
            placa = sc.nextLine();
            System.out.println("Digite o ano do veiculo");
            ano = sc.nextInt();
            sc.nextLine();
            System.out.println("digite o modelo do veiculo:");
            modelo= sc.nextLine();
            System.out.println("Digite a capacidade do veiculo");
            capacidade = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite se o veículo é alugado, com true ou false.");
            isAlugado = sc.nextBoolean();
            return veiculo = new Veiculo(placa, ano, modelo, capacidade, isAlugado, contrato);

    }
    static PontoDeParada criaPontoDeParada(){
        String nome;
        double latitude;
        double longitude;
        ArrayList<Aluno> alunos = new ArrayList<>();
        System.out.println("\nCadastro de ponto de parada!\n ");
        System.out.println("Digite o nome do ponto");
        nome = sc.nextLine();
        System.out.println("Digite a latitude");
        latitude = sc.nextDouble();
        System.out.println("Digite a longitude");
        longitude = sc.nextDouble();
        return pontoDeParada =  new PontoDeParada(nome, latitude, longitude, alunos);
    }
    static Rota criaRota(){
      PontoDeParada pontoAtual;
      ArrayList<PontoDeParada> pontosCriados = new ArrayList<>();
      int opcao;
      int totalPontos = 0;
          System.out.println("Para criar uma rota é necessário adicionar ao menos 1 ponto de parada.");
      do{
          System.out.println("Para adicionar um ponto de parada digite 1.Para cancelar digite 0.");
          opcao = sc.nextInt();
          sc.nextLine();
          if(opcao == 1){
              pontoAtual = criaPontoDeParada();
              pontosCriados.add(pontoAtual);
              System.out.println("\nPonto de parada cadastrado.");
          }else{
              if(totalPontos < 1) {
                  System.out.println("Necessario ao menos 1 ponto na rota");
              }else{
                  break;
              }
          }
          totalPontos++;
      }while(opcao != 0 && totalPontos > 0);
      rota = new Rota(pontosCriados);
      return rota;
    }
    static void calculaDemandaDeUmaRota(){
        if(rota == null){
            System.out.println("Não há rotas há terem demandas calculadas.");
            System.out.println("Digite 1 para criar uma rota.");
            int opcao = sc.nextInt();
            sc.nextLine();
            if(opcao == 1) {
                rota = criaRota();
                if(rota!=null)System.out.println("o total de demandas desta rota é: " + rota.demandaTotal());
            }
        }else{
            System.out.println("o total de demandas desta rota é: " + rota.demandaTotal());
        }
    }
    static void exibeTotalDeRotas(){
        System.out.println("O total de rotas criadas é: "+ Rota.getRotasCriadas());
    }
    static void exibeTotalDePontosDeParada(){
        System.out.println("O total de pontos de parada é: "+PontoDeParada.getTotalDeParadas());
    }
    static void exibeTipoDaPessoa(){
        int opcao;
        do{
            System.out.println("Exibe o tipo de:  Aluno, Motorista, Escola ou Fornecedor");
            System.out.println("""
                    Para aluno, digite 1.\s
                    Para motorista, digite 2
                    Para escola, digite 3.\s
                    Para fornecedor, digite 4.\s
                     Para sair, digite 8.""");
            opcao = sc.nextInt();
            if(opcao == 1){
                if(aluno == null) criaAluno();
                System.out.println(aluno.verificarTipo());
                return;
            } else if (opcao == 2) {
                if(motorista == null) criaMotorista();
                System.out.println(motorista.verificarTipo());
                return;
            } else if (opcao == 3) {
                if(escola == null) criaEscola();
                System.out.println(escola.verificarTipo());
                return;
            } else if (opcao == 4) {
                if(fornecedor == null) criaFornecedor();
                System.out.println(fornecedor.verificarTipo());
                return;
            }
        }while(opcao != 8);
    }
    static void exibeInformacoesDetalhadas(){
        int opcao;
        do{
            System.out.println("Exibe informações detalhadas de:  Aluno, Motorista, Escola ou Fornecedor");
            System.out.println("""
                    Para aluno, digite 1.\s
                    Para motorista, digite 2
                    Para escola, digite 3.\s
                    Para fornecedor, digite 4.\s
                     Para sair, digite 8.""");
            opcao = sc.nextInt();
            if(opcao == 1){
                if(aluno == null) criaAluno();
                System.out.println(aluno.apresentarDados());
                return;
            } else if (opcao == 2) {
                if(motorista == null) criaMotorista();
                System.out.println(motorista.apresentarDados());
                return;
            } else if (opcao == 3) {
                if(escola == null) criaEscola();
                System.out.println(escola.apresentarDados());
                return;
            }else if(opcao == 4){
                if(fornecedor == null) criaFornecedor();
                System.out.println(fornecedor.apresentarDados());
                return;
            }
        }while(opcao != 8);
    }

    public static void main(String[] args) {

        do{
            System.out.println("\nÉ recomendado criar na ordem, endereço, escola, ponto de parada e aluno para poupar retrabalho.");
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> criaEndereco();
                case 2 -> criaEscola();
                case 3 -> criaPontoDeParada();
                case 4 -> criaAluno();
                case 5 -> criaMotorista();
                case 6 -> criaContrato();
                case 7 -> criaFornecedor();
                case 8 -> criaVeiculo();
                case 9 -> criaRota();
                case 10 -> calculaDemandaDeUmaRota();
                case 11 -> exibeTotalDeRotas();
                case 12 -> exibeTotalDePontosDeParada();
                case 13 -> exibeTipoDaPessoa();
                case 14 -> exibeInformacoesDetalhadas();
            }
        }while(opcao != 16);




    }
}
