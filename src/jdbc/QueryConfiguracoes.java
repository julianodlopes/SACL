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
 * Autenticacao do banco de dados. Funções presentes: verificarSenha(),
 * trocarSenha(), verificarUsuario(), inserirUsuario(), removerUsuario(),
 * mostrarUsuarios(), carregarUsuarios(), verificarPermissao(), fecharConexao();
 * Data de criação: 05/09/2015.
 */
public class QueryConfiguracoes {

    Connection con = null;
    PreparedStatement stmt = null;

    //Verifica se a senha está correta para iniciar o sistema.
    public boolean verificarSenha(String usuario, String senhaAtual) {

        ResultSet rs;
        try {
            String respQueryHash;
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT hash FROM Autenticacao WHERE nome_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, usuario);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            while (rs.next()) {
                respQueryHash = rs.getString("hash");
                if (respQueryHash.equals(senhaAtual)) {
                    stmt.close();
                    con.close();
                    return true;
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

        return false;

    }

    //Realiza a troca da senha do usuário.
    public void trocarSenha(String usuario, String novaSenha) {

        try {
            Connection con = ConnectionFactory.getConnection();

            //Query para atualizar dados no banco.
            String query2 = "UPDATE Autenticacao SET hash = ? WHERE nome_usuario = ?";
            PreparedStatement stmt2 = con.prepareStatement(query2);

            //Seta os valores na string.
            stmt2.setString(1, novaSenha);
            stmt2.setString(2, usuario);

            //Executa o comando no banco.
            stmt2.executeUpdate();

            //Fecha a conexão com o banco.
            stmt2.close();
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

    //Verifica se o o nome de usuário já está em uso.
    public boolean verificarUsuario(String usuario) {

        ResultSet rs;
        try {
            String respQuery;

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_usuario FROM Autenticacao WHERE nome_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, usuario);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            while (rs.next()) {
                respQuery = rs.getString("nome_usuario");
                if (respQuery.equals(usuario)) {
                    stmt.close();
                    con.close();
                    return true;
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

        return false;

    }

    //Insere um novo usuário.
    public void inserirUsuario(String id_dept, String usuario, String hash, String permissao) {
        try {
            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para inserir dados no banco.
            String query = "INSERT INTO Autenticacao (id_dept, nome_usuario, hash, tipo_permissao) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, id_dept);
            stmt.setString(2, usuario);
            stmt.setString(3, hash);
            stmt.setString(4, permissao);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "O usuário foi incluido com sucesso.");

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

    //Remove um usuário específico.
    public void removerUsuario(String usuario) {

        try {
            Connection con = ConnectionFactory.getConnection();

            //Query para deletar dados no banco.
            String query = "DELETE FROM Autenticacao WHERE nome_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, usuario);

            //Executa o comando no banco.
            stmt.executeUpdate();

            //Fecha a conexão com o banco.
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso.");

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

    //Mostra todos os usuários cadastrados.
    public ResultSet mostrarUsuarios() {
        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT id_autenticacao, nome_usuario, tipo_permissao FROM Autenticacao";
            stmt = con.prepareStatement(query);

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

    //Mostra os usuários para serem excluidos.
    public ResultSet carregarUsuarios() {

        ResultSet rs = null;

        try {
            //Realiza a conexão.
            con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_usuario FROM Autenticacao";
            stmt = con.prepareStatement(query);

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

    //Verifica a permissão de um usuário.
    public boolean verificarPermissao(String usuario) {

        ResultSet rs;
        try {
            String respQueryHash;

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT tipo_permissao FROM Autenticacao WHERE nome_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, usuario);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            while (rs.next()) {
                respQueryHash = rs.getString("tipo_permissao");
                if (respQueryHash.equals("Controle total")) {
                    stmt.close();
                    con.close();
                    return true;
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
        return false;

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
