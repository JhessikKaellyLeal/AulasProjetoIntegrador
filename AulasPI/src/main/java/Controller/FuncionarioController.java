/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.FuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class FuncionarioController {
    // Cadastrar novo funcionário
    public boolean cadastrarFuncionario(FuncionarioModel f) {
        String sql = "INSERT INTO Funcionario(nome, cpf, telefone, sexo, email, senha) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, f.getNome());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getSexo());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getSenha());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
