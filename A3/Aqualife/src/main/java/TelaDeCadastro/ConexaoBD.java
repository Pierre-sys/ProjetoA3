/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaDeCadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Caue
 */
public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/db_agua";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234";

public void insertCliente(Cliente cliente) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "INSERT INTO tb_cliente (nome, idade, email, senha) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getIdade());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getSenha());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }
    }

public void updateCliente(Cliente cliente) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "UPDATE tb_cliente SET nome = ?, senha = ?, idade = ? WHERE email = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getSenha());
            statement.setString(3, cliente.getIdade());
            statement.setString(4, cliente.getEmail());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }
    }

public void deleteCliente(String email) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "DELETE FROM tb_cliente WHERE email = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, email);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }
    }

public Cliente getClienteByEmail(String email) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "SELECT * FROM tb_cliente WHERE email = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String clienteEmail = resultSet.getString("email");
                String nome = resultSet.getString("nome");
                String senha = resultSet.getString("senha");
                String idade = resultSet.getString("idade");

                return new Cliente(senha, nome, idade, clienteEmail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }

        return null;
    }
    public String verifyClienteByEmail(String email) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "SELECT senha FROM tb_cliente WHERE email = ?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                
                return resultSet.getString("senha");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }

        return null;
    }
    public void insertConsumo(Consumo consumo) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "insert into tb_consumo (Tempo_no_Banho, Quantas_Descargas,Tempo_Lavando_louça, Tempo_Escovando_Dentes, Gasto_Total) values (?, ?, ?, ?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, consumo.getTempBanho());
            statement.setInt(2, consumo.getTempDescarga());
            statement.setInt(3, consumo.getTempLouca());
            statement.setInt(4, consumo.getTempEscovDent());
            statement.setInt(5, consumo.getLitros());
            

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Tratar exceção ou lançar para quem chamou o método
        }
    }
}
