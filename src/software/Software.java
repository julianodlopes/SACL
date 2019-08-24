/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import view.ViewLogin;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito iniciar o programa. Função presente: main(); Data de criação:
 * 05/09/2015.
 */
public class Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicia o sistema.
        ViewLogin view = new ViewLogin();
        view.setVisible(true);
    }

}
