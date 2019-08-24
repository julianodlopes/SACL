/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito realizar seleções, inserções, atualizações e exclusões na tabela
 * Equipamento do banco de dados. Funções presentes: inserirEquipamento();
 * atualizarEquipamento(); removerEquipamento(); mostrarEquipamentos();
 * retornarCamposEquipamento(); fecharConexao(); Data de criação: 05/09/2015
 */
public class QueryEquipamento {

    Connection con = null;
    PreparedStatement stmt = null;

    //Insere um equipamento.
    public void inserirEquipamento(String id_dept, String equipamento, String modelo,
            String tag, String patrimonio, String funed, String serie, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para inserir dados no banco.
            String query = "INSERT INTO Equipamento (id_dept, nome_eq, modelo_eq, "
                    + "tag_eq, patrimonio_eq, num_funed_eq, serie_eq, obs_eq) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id_dept);
            stmt.setString(2, equipamento);
            stmt.setString(3, modelo);
            stmt.setString(4, tag);
            stmt.setString(5, patrimonio);
            stmt.setString(6, funed);
            stmt.setString(7, serie);
            stmt.setString(8, obs);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "O equipamento foi incluido com sucesso.");

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe."
                    + "\nDetalhes:" + ex.getMessage());

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:" + ex.getMessage());
        }
    }

    //Atualiza o registro de um equipamento.
    public void atualizarEquipamento(String id_dept, String item, String equipamento, String modelo,
            String tag, String patrimonio, String funed, String serie, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para atualizar dados no banco.
            String query = "UPDATE Equipamento SET nome_eq = ?, modelo_eq = ?, tag_eq = ?, "
                    + "patrimonio_eq = ?, num_funed_eq = ?, serie_eq = ?, obs_eq = ? WHERE id_equip = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, equipamento);
            stmt.setString(2, modelo);
            stmt.setString(3, tag);
            stmt.setString(4, patrimonio);
            stmt.setString(5, funed);
            stmt.setString(6, serie);
            stmt.setString(7, obs);
            stmt.setString(8, item);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "As alterações foram feitas com sucesso.");

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe."
                    + "\nDetalhes:" + ex.getMessage());

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:" + ex.getMessage());
        }
    }

    //Remove um equipamento.
    public void removerEquipamento(String id) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para deletar dados no banco.
            String query = "DELETE FROM Equipamento WHERE id_equip = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Equipamento excluido com sucesso.");

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe."
                    + "\nDetalhes:" + ex.getMessage());

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:" + ex.getMessage());
        }

    }

    //Mostra os equipamentos.
    public ResultSet mostrarEquipamentos(String equipamento) {
        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT * FROM Equipamento WHERE nome_eq LIKE ?";
            stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, equipamento + "%");

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe."
                    + "\nDetalhes:" + ex.getMessage());

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:" + ex.getMessage());
        }

        return rs;
    }

    //Retorna os dados de um equipamento.
    public ResultSet retornarCamposEquipamento(String item) {

        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT * FROM Equipamento WHERE id_equip = ?";
            stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, item);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe."
                    + "\nDetalhes:" + ex.getMessage());

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:" + ex.getMessage());
        }

        return rs;
    }

    //Fecha a conexão com o banco de dados.
    public void fecharConexao() {

        try {
            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            //Caso ocorra um erro de SQL, é enviada uma mensagem.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes:  " + ex.getMessage());
        }

    }

}
