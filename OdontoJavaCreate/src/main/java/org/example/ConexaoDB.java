package org.example;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.Scanner;

public class ConexaoDB {
   private static final String url = "jdbc:sqlite:C:\\Users\\Vinícius\\Desktop\\odonto\\Banco.db";
    private static Connection conexao = null;
    Scanner sc = new Scanner(System.in);


    public Connection conectar(){
        if(conexao == null){
            try {
                conexao = DriverManager.getConnection(url);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return conexao;
    }

    public void inserirDentista(Dentista dentista){

        String sql = "INSERT INTO dentistas (nome,especialidade) VALUES (?,?)";

        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            stmt.setString(1,dentista.nome);
            stmt.setString(2,dentista.especialidade);
            stmt.executeUpdate();
            System.out.println("Dentista cadastrado com sucesso!");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar dentista" + e.getMessage());
        }

    }

    public void inserirPaciente(Paciente paciente){



        String sql = "Insert into pacientes (nome,data_nascimento,endereco,telefone,email) VALUES (?,?,?,?,?)";
       try( PreparedStatement resposta = conectar().prepareStatement(sql)){
            resposta.setString(1,paciente.nome);
           resposta.setString(2, paciente.dataN);
           resposta.setString(3, paciente.endereco);
           resposta.setString(4, paciente.telefone);
           resposta.setString(5, paciente.email);
           resposta.executeUpdate();

           System.out.println("Paciente cadastrado com sucesso!");
       } catch (Exception e) {
           System.out.println("Erro ao cadastrar o paciente" + e.getMessage());
       }


    }

    public  void  inserirData(Consulta consulta){

        String sql ="Insert into consultas (dentista, paciente, data_hora) VALUES  (?,?,?)";
        try( PreparedStatement resposta = conectar().prepareStatement(sql)){
            resposta.setInt(1, consulta.idDentista);
            resposta.setString(2, consulta.paciente);
            resposta.setString(3, consulta.data);
            resposta.executeUpdate();

            System.out.println("Consulta agendada com sucesso!");
        }  catch (Exception e)  {
            System.out.println("Erro ao agendar consulta!" + e.getMessage());
        }
    }

    public void listarDentistas(){
        String sql = "select * from dentistas";
        try(PreparedStatement stmt = conectar().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String especialidade = rs.getString("especialidade");
                System.out.printf("Id: %d,Nome: %s, Especialidade: %s%n", id, nome, especialidade);
                }
        } catch (SQLException e) {
            System.out.println("Erro ao listar dentistas" + e.getMessage());
        }
    }
    public  void DesmarcarConsultas(){
        String sql ="delete * from consultas where id = ?";
        try(PreparedStatement stmt = conectar().prepareStatement(sql);
            ResultSet rs = rs.getString()
    }
    }

