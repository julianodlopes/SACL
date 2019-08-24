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
 * Reagente do banco de dados. Funções presentes: inserirReagente();
 * atualizarReagente(); removerReagente(); mostrarReagentes();
 * retornarCamposReagente(); validadeReagentes(); reagentesVencidos();
 * fecharConexao(); Data de criação: 05/09/2015.
 */
public class QueryReagente {

    Connection con = null;
    PreparedStatement stmt = null;

    //Insere um reagente (líquido/sólido).
    public void inserirReagente(String id_dept, String nome, String tipo, String marca,
            String apresentacao, String lote, String entrada, String validade, String quantidade,
            String policiafederal, String saida, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para inserir dados no banco.
            String query = "INSERT INTO Reagente (id_dept, nome_rg, tipo_rg, marca_rg, "
                    + "apresentacao_rg, lote_rg, entrada_rg, validade_rg, quantidade_rg, "
                    + "pf_rg, saida_rg, obs_rg) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id_dept);
            stmt.setString(2, nome);
            stmt.setString(3, tipo);
            stmt.setString(4, marca);
            stmt.setString(5, apresentacao);
            stmt.setString(6, lote);
            stmt.setString(7, entrada);
            stmt.setString(8, validade);
            stmt.setString(9, quantidade);
            stmt.setString(10, policiafederal);
            stmt.setString(11, saida);
            stmt.setString(12, obs);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "O reagente foi incluido com sucesso.");

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

    //Atualiza o registro de um reagente (líquido/sólido)
    public void atualizarReagente(String id_dept, String item, String nome,
            String tipo, String marca, String apresentacao, String lote, String entrada,
            String validade, String quantidade, String policiafederal, String saida, String obs) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para atualizar dados no banco.
            String query = "UPDATE Reagente SET nome_rg = ?, tipo_rg = ?, marca_rg = ?, "
                    + "apresentacao_rg = ?, lote_rg = ?, entrada_rg = ?, validade_rg = ?, "
                    + "quantidade_rg = ?, pf_rg = ?, saida_rg = ?, obs_rg = ? WHERE id_rg = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, nome);
            stmt.setString(2, tipo);
            stmt.setString(3, marca);
            stmt.setString(4, apresentacao);
            stmt.setString(5, lote);
            stmt.setString(6, entrada);
            stmt.setString(7, validade);
            stmt.setString(8, quantidade);
            stmt.setString(9, policiafederal);
            stmt.setString(10, saida);
            stmt.setString(11, obs);
            stmt.setString(12, item);

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

    //Remove um reagente (líquido/sólido).
    public void removerReagente(String id) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para deletar dados no banco.
            String query = "DELETE FROM Reagente WHERE id_rg = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Reagente excluido com sucesso.");

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

    //Mostra os reagentes (líquido/sólido).
    public ResultSet mostrarReagentes(String nome) {
        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT id_rg, nome_rg, tipo_rg, "
                    + "DATE_FORMAT(validade_rg,'%d/%m/%Y') "
                    + "as validade_rg FROM reagente WHERE nome_rg LIKE ?";
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

    //Retorna os dados de um reagente (líquido/sólido).
    public ResultSet retornarCamposReagente(String item) {

        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_rg, tipo_rg, marca_rg, apresentacao_rg, "
                    + "lote_rg, quantidade_rg, pf_rg, obs_rg, "
                    + "DATE_FORMAT(entrada_rg,'%d/%m/%Y') as entrada_rg, "
                    + "DATE_FORMAT(validade_rg,'%d/%m/%Y') as validade_rg, "
                    + "DATE_FORMAT(saida_rg,'%d/%m/%Y') as saida_rg FROM reagente WHERE id_rg = ?";
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

    //Verifica a validade dos reagentes.
    public void validadeReagentes() {

        ResultSet rs;
        try {
            String respQuery;

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_rg FROM reagente WHERE "
                    + "DATEDIFF(validade_rg, CURDATE()) BETWEEN 0 AND 30";
            PreparedStatement stmt = con.prepareStatement(query);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Imprimi os reagentes que faltam 30 dias ou menos para vencer.
            while (rs.next()) {
                respQuery = rs.getString("nome_rg");
                if (!respQuery.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Os seguintes reagentes "
                            + "estão vencendo! \nReagente: " + respQuery);
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
