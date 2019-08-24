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
 * Autenticacao do banco de dados. Função presente: consultarLogin(); Data de
 * criação: 05/09/2015.
 */
public class QuerySistema {

    //Verifica se o usuário está devidamente cadastrado para iniciar o sistema.
    public boolean consultarLogin(String usuario, String hash) {

        ResultSet rs;
        try {
            String respQueryUsuario;
            String respQueryHash;

            //Realiza a conexão.
            Connection con = ConnectionFactory.getConnection();

            //Query para selecionar dados no banco.
            String query = "SELECT nome_usuario, hash, IF(STRCMP(nome_usuario,?) and STRCMP(hash,?) , "
                    + "'true','false') FROM Autenticacao ";
            PreparedStatement stmt = con.prepareStatement(query);

            //Seta os valores na string.
            stmt.setString(1, usuario);
            stmt.setString(2, hash);

            //Executa o comando no banco.
            rs = stmt.executeQuery();

            //Testa se o usuário e a senha estão corretos.
            while (rs.next()) {
                respQueryUsuario = rs.getString("nome_usuario");
                respQueryHash = rs.getString("hash");
                if (respQueryUsuario.equals(usuario) && respQueryHash.equals(hash)) {
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
            System.exit(0);
        }

        return false;
    }

}
