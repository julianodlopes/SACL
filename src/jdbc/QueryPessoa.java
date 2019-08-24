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
 * Pessoa do banco de dados. Funções presentes: inserirPessoa();
 * atualizarPessoa(); removerPessoa(); mostrarPessoas(); retornarCamposPessoa();
 * fecharConexao(); Data de criação: 05/09/2015.
 */
public class QueryPessoa {

    Connection con = null;
    PreparedStatement stmt = null;

    //Insere uma pessoa (estagiário/funcionário).
    public void inserirPessoa(String id_dept, String relacionamento, String nome, String sexo,
            String nasc, String estadoCivel, String email, String res, String cell, String prof,
            String cep, String log, String num, String bairro, String cidade, String estado,
            String complemento, String obs1, String obs2) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para inserir dados no banco.
            String query = "INSERT INTO Pessoa (id_dept, relacionamento_ps, nome_ps, sexo_ps, "
                    + "data_nasc_ps, estado_civil_ps, email_ps, tel_residencial_ps, tel_celular_ps, "
                    + "profissao_ps, cep_ps, logradouro_ps, numero_ps, bairro_ps, "
                    + "cidade_ps, estado_ps, complemento_ps, obs_ps, obs2_ps) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id_dept);
            stmt.setString(2, relacionamento);
            stmt.setString(3, nome);
            stmt.setString(4, sexo);
            stmt.setString(5, nasc);
            stmt.setString(6, estadoCivel);
            stmt.setString(7, email);
            stmt.setString(8, res);
            stmt.setString(9, cell);
            stmt.setString(10, prof);
            stmt.setString(11, cep);
            stmt.setString(12, log);
            stmt.setString(13, num);
            stmt.setString(14, bairro);
            stmt.setString(15, cidade);
            stmt.setString(16, estado);
            stmt.setString(17, complemento);
            stmt.setString(18, obs1);
            stmt.setString(19, obs2);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "A pessoa foi incluida com sucesso.");

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

    //Atualiza o registro de uma pessoa (estagiário/pessoa)
    public void atualizarPessoa(String id_dept, String item, String relacionamento, String nome,
            String sexo, String nasc, String estadoCivel, String email, String res, String cell,
            String prof, String cep, String log, String num, String bairro, String cidade, String estado,
            String complemento, String obs1, String obs2) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para atualizar dados no banco.
            String query = "UPDATE Pessoa SET relacionamento_ps = ?, nome_ps = ?, sexo_ps = ?, "
                    + "data_nasc_ps = ?, estado_civil_ps = ?, email_ps = ?, tel_residencial_ps = ?, "
                    + "tel_celular_ps = ?, profissao_ps = ?, cep_ps = ?, logradouro_ps = ?, "
                    + "numero_ps = ?, bairro_ps = ?, cidade_ps = ?, estado_ps = ?, complemento_ps = ?, "
                    + "obs_ps = ?, obs2_ps = ? WHERE id_nome = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, relacionamento);
            stmt.setString(2, nome);
            stmt.setString(3, sexo);
            stmt.setString(4, nasc);
            stmt.setString(5, estadoCivel);
            stmt.setString(6, email);
            stmt.setString(7, res);
            stmt.setString(8, cell);
            stmt.setString(9, prof);
            stmt.setString(10, cep);
            stmt.setString(11, log);
            stmt.setString(12, num);
            stmt.setString(13, bairro);
            stmt.setString(14, cidade);
            stmt.setString(15, estado);
            stmt.setString(16, complemento);
            stmt.setString(17, obs1);
            stmt.setString(18, obs2);
            stmt.setString(19, item);

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

    //Remove uma pessoa (estagiário/funcionário).
    public void removerPessoa(String id) {

        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para deletar dados no banco.
            String query = "DELETE FROM Pessoa WHERE id_nome = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string de inserção.
            stmt.setString(1, id);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso.");

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

    //Mostra as pessoas (estagiário/funcionário).
    public ResultSet mostrarPessoas(String nome) {
        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT * FROM Pessoa WHERE nome_ps LIKE ?";
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

    //Retorna os dados de uma pessoa (estagiário/funcionário).
    public ResultSet retornarCamposPessoa(String item) {

        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco
            String query = "SELECT relacionamento_ps, nome_ps, sexo_ps, "
                    + "DATE_FORMAT(data_nasc_ps,'%d/%m/%Y') as data_nasc_ps, "
                    + "estado_civil_ps, email_ps, tel_residencial_ps, tel_celular_ps, profissao_ps,  "
                    + "cep_ps, logradouro_ps, numero_ps, bairro_ps, "
                    + "cidade_ps, estado_ps, complemento_ps, obs_ps, obs2_ps FROM pessoa "
                    + "WHERE id_nome = ?";
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
