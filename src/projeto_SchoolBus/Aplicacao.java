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
    static Endereco enderecoDoCliente;
    static Aluno aluno;
    static Motorista motorista;
    static Contrato contrato;
    static Escola escola;
    static Veiculo veiculo;
    static PontoDeParada pontoDeParada;

    static void menu(){
        System.out.println("Bem vindo ao menu School Bus\n");
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
        System.out.println("12. Sair da aplicacao\n");
    }
    static Endereco criaEndereco(){
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
        return enderecoDoCliente = new Endereco(rua,numero,complemento,bairro);
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
        Escola escola;
        Endereco endereco;
        int matricula;
        int serie;
        String turno;
        // caso nao tenha endereco cadastrado:
        String rua;
        String bairro;
        int numero_casa;
        String complemento;

        if(enderecoDoCliente == null){
            System.out.println("Não há endereco cadastrado.\n Não é possível cadastrar um aluno sem endereco. ");
            System.out.println("Digite 1 para cadastrar um aluno com endereco, ou 2 para não cadastrar.");
            int resposta = sc.nextInt();
            sc.nextLine();
            if (resposta == 1){
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
                System.out.println("Insira a rua:");
                rua = sc.nextLine();
                System.out.println("Insira o número:");
                numero_casa = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha
                System.out.println("Insira o complemento:");
                complemento = sc.nextLine();
                System.out.println("Insira o bairro:");
                bairro = sc.nextLine();
                return new Aluno(nome, nome_civil, cpf, data_nascimento,nome_pai,nome_mae, naturalidade, telefone, new Endereco(rua,numero_casa, complemento,bairro), matricula, serie, turno);
            }else{
                return null;
            }
        }else{
            System.out.println("Já existe um endereco cadastrado. deseja cadastrar um novo?");
            System.out.println("1 - Cadastrar aluno com outro endereco \n 2 - Utilizar endereco cadastrado");
            int resposta = sc.nextInt();
            if(resposta == 1){
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
                    throw new RuntimeException("Formato da data inválido");
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
                System.out.println("Insira a rua:");
                rua = sc.nextLine();
                System.out.println("Insira o número:");
                numero_casa = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha
                System.out.println("Insira o complemento:");
                complemento = sc.nextLine();
                System.out.println("Insira o bairro:");
                bairro = sc.nextLine();
                return new Aluno(nome, nome_civil, cpf, data_nascimento,nome_pai,nome_mae, naturalidade, telefone, new Endereco(rua,numero_casa, complemento,bairro), matricula, serie, turno);
            }else{
                System.out.println("Insira o nome do aluno:");
                nome = sc.nextLine();
                sc.nextLine();
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
                    throw new RuntimeException("Formato da data inválido");
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
                aluno = new Aluno(nome, nome_civil, cpf, data_nascimento,nome_pai,nome_mae, naturalidade, telefone, enderecoDoCliente, matricula, serie, turno);
                return aluno;
            }
        }
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

        //Caso o cliente nao tenha cadastrado endereco ou queira criar uma agregacao forte
        String rua;
        String bairro;
        int numero_casa;
        String complemento;

        if(enderecoDoCliente == null){
            System.out.println("Não há endereco cadastrado.\n Não é possível cadastrar um motorista sem endereco. ");
            System.out.println("Digite 1 para cadastrar um motorista com endereco, ou 2 para não cadastrar.");
            int resposta = sc.nextInt();
            sc.nextLine();
            System.out.println("Insira o nome do motorista:");
            nome = sc.nextLine();
            System.out.println("Insira o nome social do motorista:");
            nome_civil = sc.nextLine();
            System.out.println("Insira o cpf ou cnpj do motorista:");
            cpf_cnpj = sc.nextLine();
            System.out.println("Nome do pai do motorista:");
            nome_pai = sc.nextLine();
            System.out.println("Nome da mãe do motorista:");
            nome_mae = sc.nextLine();
            System.out.println("Naturalidade do motorista:");
            naturalidade = sc.nextLine();
            System.out.println("Numero de contato do motorista. (XX) XXXXX-XXXX");
            numero_contato = sc.nextLine();
            System.out.println("Carteira de habilitacao do motorista. Adicione o caractere.");
            habilitacao = sc.nextLine().toCharArray();
            System.out.println("Insira sua data de nascimento no fomrato dd/MM/aaaa");
            String dataNascimentoString = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                data_nascimento = sdf.parse(dataNascimentoString);
            } catch (ParseException e) {
                throw new RuntimeException("Formato de data errado.");
            }
            System.out.println("Numero de habilitacao do motorista:");
            num_habilitacao = sc.nextLine();
            System.out.println("Insira a rua:");
            rua = sc.nextLine();
            System.out.println("Insira o número:");
            numero_casa = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha
            System.out.println("Insira o complemento:");
            complemento = sc.nextLine();
            System.out.println("Insira o bairro:");
            bairro = sc.nextLine();
            return new Motorista(nome_civil,cpf_cnpj,nome_pai,nome_mae,naturalidade,numero_contato,habilitacao, data_nascimento,rua,bairro,numero_casa,complemento,num_habilitacao);
        }else{
            System.out.println("Insira o nome do motorista:");
            nome = sc.nextLine();
            System.out.println("Insira o nome social do motorista:");
            nome_civil = sc.nextLine();
            System.out.println("Insira o cpf ou cnpj do motorista:");
            cpf_cnpj = sc.nextLine();
            System.out.println("Nome do pai do motorista:");
            nome_pai = sc.nextLine();
            System.out.println("Nome da mãe do motorista:");
            nome_mae = sc.nextLine();
            System.out.println("Naturalidade do motorista:");
            naturalidade = sc.nextLine();
            System.out.println("Numero de contato do motorista. (XX) XXXXX-XXXX");
            numero_contato = sc.nextLine();
            System.out.println("Carteira de habilitacao do motorista. Adicione o caractere.");
            habilitacao = sc.nextLine().toCharArray();
            System.out.println("Insira sua data de nascimento no fomrato dd/MM/aaaa");
            String dataNascimentoString = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                data_nascimento = sdf.parse(dataNascimentoString);
            } catch (ParseException e) {
                throw new RuntimeException("Formato de data errado.");
            }
            System.out.println("Numero de habilitacao do motorista:");
            num_habilitacao = sc.nextLine();

            return new Motorista(nome_civil,nome,enderecoDoCliente,cpf_cnpj,nome_pai,nome_mae,naturalidade,numero_contato,habilitacao,data_nascimento,num_habilitacao);
        }
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
        return new Contrato(num_contrato,data_inicio,data_fim,valor);
    }
    static Escola criaEscola(){
        String nome;
        String telefone;
        String cnpj;
        Endereco endereco;

        //Caso o cliente nao tenha cadastrado endereco ou queira criar uma agregacao forte
        String rua;
        String bairro;
        int numero_casa;
        String complemento;

        if(enderecoDoCliente == null){
                System.out.println("Não há endereco cadastrado.\n Não é possível cadastrar um motorista sem endereco. ");
                System.out.println("Digite 1 para cadastrar uma escola com endereco, ou 2 para não cadastrar.");
                int resposta = sc.nextInt();
                sc.nextLine();
                if(resposta == 1){
                    endereco = criaEndereco();
                    System.out.println("Insira o nome da escola: ");
                    nome = sc.nextLine();
                    System.out.println("Insira o numero de telefone da escola. Padrão (XX) XXXXX-XXXX");
                    telefone = sc.nextLine();
                    System.out.println("Digite o cnpj da escola:");
                    cnpj = sc.nextLine();
                    return new Escola(nome,endereco, telefone, cnpj);
                }else{
                    return null;
                }
        }else{
            System.out.println("Insira o nome da escola: ");
            nome = sc.nextLine();
            System.out.println("Insira o numero de telefone da escola. Padrão (XX) XXXXX-XXXX");
            telefone = sc.nextLine();
            System.out.println("Digite o cnpj da escola:");
            cnpj = sc.nextLine();
            return new Escola(nome, enderecoDoCliente,telefone,cnpj);
        }
    }
    static Veiculo criaVeiculo(){
        String placa;
        int ano;
        String modelo;
        int capacidade;
        boolean isAlugado;
        if(contrato == null){
            System.out.println("Não há contrato para vincular. É necessário um contrato para criar um veículo.");
            System.out.println("Digite 1 para criar um novo contrato. Digite 2 para cancelar.");
            int opcao = sc.nextInt();
            if(opcao == 1){
                contrato = criaContrato();
                System.out.println("Digite a placa do veiculo: ");
                placa = sc.nextLine();
                System.out.println("Digite o ano do veiculo");
                ano = sc.nextInt();
                System.out.println("digite o modelo do veiculo:");
                modelo= sc.nextLine();
                System.out.println("Digite a capacidade do veiculo");
                capacidade = sc.nextInt();
                System.out.println("Digite se o veículo é alugado, com true ou false.");
                isAlugado = sc.nextBoolean();
                return new Veiculo(placa, ano, modelo, capacidade, isAlugado, contrato);
            }else{
                return null;
            }
        }else{
        System.out.println("Digite a placa do veiculo: ");
        placa = sc.nextLine();
        System.out.println("Digite o ano do veiculo");
        ano = sc.nextInt();
        System.out.println("digite o modelo do veiculo:");
        modelo= sc.nextLine();
        System.out.println("Digite a capacidade do veiculo");
        capacidade = sc.nextInt();
        System.out.println("Digite se o veículo é alugado, com true ou false.");
        isAlugado = sc.nextBoolean();
        return new Veiculo(placa, ano, modelo, capacidade, isAlugado, contrato);
    }
    }
    static PontoDeParada criaPontoDeParada(){
        int id;
        String nome;
        double latitude;
        double longitude;
        ArrayList<Aluno> alunos = new ArrayList<>();

        if(aluno == null){
            System.out.println("Não há alunos para serem adicionados ao ponto de parada.");
            System.out.println("Não é possível criar um ponto de parada sem pelo menos um aluno");
            System.out.println("Digite 1 para criar um novo aluno. \n Digite 2 para cancelar.");
            int opcao = sc.nextInt();
            if(opcao == 1){
                Aluno novoAluno = criaAluno();
                System.out.println("Digite o id");
                id = sc.nextInt();
                System.out.println("Digite o nome do ponto");
                nome = sc.nextLine();
                nome = sc.nextLine();
                System.out.println("Digite a latitude");
                latitude = sc.nextDouble();
                System.out.println("Digite a longitude");
                longitude = sc.nextDouble();
                alunos.add(novoAluno);
                return new PontoDeParada(id, nome, latitude, longitude, alunos);
            }else{
                return null;
            }
        }else{
            System.out.println("Digite o id");
            id = sc.nextInt();
            System.out.println("Digite o nome do ponto");
            nome = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite a latitude");
            latitude = sc.nextDouble();
            System.out.println("Digite a longitude");
            longitude = sc.nextDouble();
            alunos.add(aluno);
            return new PontoDeParada(id, nome, latitude, longitude, alunos);
        }

    }


    public static void main(String[] args) {

        do{
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> criaEndereco();
                case 2 -> criaAluno();
                case 3 -> criaMotorista();
                case 4 -> criaContrato();
                case 5 -> criaEscola();
                case 6 -> criaVeiculo();
                case 7 -> criaPontoDeParada();
            }
        }while(opcao != 12);




    }
}
