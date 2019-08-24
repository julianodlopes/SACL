/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito realizar a conexão com o banco de dados. Função presente:
 * getConnection(); Data de criação: 05/09/2015
 */
public class ConnectionFactory {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            //Procura por uma classe no projeto.
            Class.forName("com.mysql.jdbc.Driver");

            //Realiza a conexão.
            return DriverManager.getConnection("jdbc:mysql://localhost/software", "root", "");

            //Caso não encontre a classe, é enviada uma mensagem.
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe. "
                    + "\nDetalhes: " + ex.getMessage());
            throw new SQLException(ex.getMessage());
        }
    }

}
