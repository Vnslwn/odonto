package org.example;

import java.util.Scanner;

import static org.example.Entradas.lerInt;
import static org.example.Entradas.lerString;

public class TelaPadrao {
    Scanner sc = new Scanner(System.in);
    ConexaoDB conexao = new ConexaoDB();

    public void padrao() {
        while (true) {
            System.out.println("==Menu==");
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1. Cadastrar dentista");
            System.out.println("2. Cadastrar paciente");
            System.out.println("3. Marcar consultas");
            System.out.println("4. Desmarcar consultas");
            System.out.println("5. Listar consultas");
            System.out.println("6. Sair");
            int i = lerInt();
            switch (i) {
                case 1:
                    cadastrarDentista();
                    padrao();
                    break;
                case 2:
                    cadastrarPaciente();
                    padrao();
                case 3:
                    conexao.listarDentistas();
                    MarcarConsultaS();
                    padrao();
                    break;
                case 4:
                    desmarcarConsultas();
                    padrao();
                    break;
                case 5:
                    listarConsultas();
                    padrao();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }
    }

    private void listarConsultas() {

    }

    private void desmarcarConsultas() {

    }


    private void cadastrarPaciente() {
        sc.nextLine();
        sc.nextLine();
        System.out.println("==Cadastro de paciente==");
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu telefone: ");
        String tel = sc.nextLine();
        System.out.print("Digite o seu email: ");
        String email = sc.nextLine();
        System.out.print("Digite o seu endereco");
        String endereco = sc.nextLine();
        System.out.print("Digite a sua data de nascimento(Separada por /(barra)): ");
        String dataN = sc.nextLine();

        Paciente paciente = new Paciente(nome, email, tel, endereco, dataN);
        conexao.inserirPaciente(paciente);


    }

    private void cadastrarDentista() {
        System.out.println("==Cadastro de dentista==");
        System.out.print("Digite o nome: ");
        String nome = lerString();
        System.out.print("Digite a especialidade do " + nome);
        String especialidade = lerString();

        Dentista dentista = new Dentista(nome, especialidade);
        conexao.inserirDentista(dentista);


    }

    private void MarcarConsultaS() {
        System.out.println("==Marcar consulta==");
        System.out.print("Digite o seu nome: ");
        String nome = lerString();
        System.out.print("Digite a data que deseja marcar a consulta: ");
        String data = lerString();
        System.out.print("Digite o id do dentista: ");
        int id = lerInt();

        Consulta consulta = new Consulta(id,nome,data);
        conexao.inserirData(consulta);
        System.out.println("Consulta cadastrada com sucesso!");

    }

    private void ListarConsultaS() {
        System.out.println("==Listar Consulas==");
        System.out.println("Digite nome paciente");
        String paciente = lerString();
        System.out.println("Digite nome do dentista:");
        String dentista =lerString();
        System.out.print("digite o id da data_hora:");
        int id =lerInt();

        Consulta consulta = new Consulta(id,paciente,dentista);
        conexao.inserirData(consulta);
        System.out.println("Listagem feita com sucesso!");



    }

    private void DesmarcarConsultaS() {
        System.out.println("Remover paciente");
        String paciente = lerString();
        System.out.println("==Remover dentista==");
        String dentista =lerString();
        System.out.println("selecione id para desmarcar data_hora");
        int id =lerInt();

        Consulta consulta = new Consulta(paciente,dentista,id);


    }
}
