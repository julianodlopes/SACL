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
 * propósito realizar seleçoes, inserções, atualizações e exclusões na tabela
 * Freezer do banco de dados. Funções presentes: inserirFreezer();
 * atualizarFreezer(); removerFreezer(); mostrarFreezer();
 * retornarCamposFreezer(); validadeFreezer(); substanciasVencidas();
 * fecharConexao(); Data de criação: 05/09/2015.
 */
public class QueryFreezer {

    Connection con = null;
    PreparedStatement stmt = null;

    //Insere uma substância no freezer.
    public void inserirFreezer(String id_dept, String nome, String marca,
            String validade, String identificacao, String lote, String quantidade, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para inserir dados no banco.
            String query = "INSERT INTO Freezer (id_dept, nome_fz, marca_fz, validade_fz, "
                    + "identificacao_fz, lote_fz, quantidade_fz, obs_fz) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id_dept);
            stmt.setString(2, nome);
            stmt.setString(3, marca);
            stmt.setString(4, validade);
            stmt.setString(5, identificacao);
            stmt.setString(6, lote);
            stmt.setString(7, quantidade);
            stmt.setString(8, obs);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "A substância foi incluida com sucesso.");

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

    //Atualiza a substância do freezer.
    public void atualizarFreezer(String id_dept, String item, String nome, String marca,
            String validade, String identificacao, String lote, String quantidade, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para atualizar dados no banco.
            String query = "UPDATE Freezer SET nome_fz = ?, marca_fz = ?, validade_fz = ?, "
                    + "identificacao_fz = ?, lote_fz = ?, quantidade_fz = ?, obs_fz = ? "
                    + "WHERE id_freezer = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setString(3, validade);
            stmt.setString(4, identificacao);
            stmt.setString(5, lote);
            stmt.setString(6, quantidade);
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

    //Remove a substância do freezer.
    public void removerFreezer(String id) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para deletar dados no banco.
            String query = "DELETE FROM Freezer WHERE id_freezer = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Substância do freezer excluida com sucesso.");

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

    //Mostra a substância do freezer.
    public ResultSet mostrarFreezer(String nome) {
        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco
            String query = "SELECT id_freezer, nome_fz, DATE_FORMAT(validade_fz,'%d/%m/%Y') "
                    + "as validade_fz FROM freezer WHERE nome_fz LIKE ?";
            stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, nome + "%");

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

    //Retorna os dados de uma substância no freezer.
    public ResultSet retornarCamposFreezer(String item) {

        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_fz, marca_fz, identificacao_fz, "
                    + "lote_fz, quantidade_fz, obs_fz, DATE_FORMAT(validade_fz,'%d/%m/%Y') "
                    + "as validade_fz FROM freezer WHERE id_freezer = ?";
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

    //Verifica a validade das substâncias no freezer.
    public void validadeFreezer() {

        ResultSet rs;
        try {
            String respQuery;

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_fz FROM freezer WHERE "
                    + "DATEDIFF(validade_fz, CURDATE()) BETWEEN 0 AND 30";
            PreparedStatement stmt = con.prepareStatement(query);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Imprimi as substâncias do freezer que faltam 30 dias ou menos para vencer.
            while (rs.next()) {
                respQuery = rs.getString("nome_fz");
                if (!respQuery.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "As seguintes substâncias do freezer "
                            + "estão vencendo! \nSubstância: " + respQuery);
                }
            }

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

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

    //Retorna as substâncias vencidas do freezer.
    public ResultSet substanciasVencidas() {

        ResultSet rs = null;
        try {

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT id_freezer FROM freezer "
                    + "WHERE DATEDIFF(validade_fz, CURDATE()) <= 0";
            PreparedStatement stmt = con.prepareStatement(query);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

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
