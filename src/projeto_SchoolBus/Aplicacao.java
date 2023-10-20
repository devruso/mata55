package projeto_SchoolBus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static void main(String[] args) {

        do{
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    criaEndereco();
                    break;
                case 2:
                    criaAluno();
                    break;
            }
        }while(opcao != 12);




    }
}
