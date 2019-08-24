/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import javax.swing.JFormattedTextField;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito transformar os campos de data para serem inseridos no banco de
 * dados. Função presente: transformarCampo(); Data de criação: 05/09/2015.
 */
public class TransformarCampos {

    String campo;

    //Transforma a data para ser aceita no banco de dados.
    public String transformarCampo(JFormattedTextField jformatted) {

        campo = jformatted.getText();

        if (!campo.equals("  /  /    ")) {

            String d1 = Character.toString(campo.charAt(0));
            String d2 = Character.toString(campo.charAt(1));
            String m1 = Character.toString(campo.charAt(3));
            String m2 = Character.toString(campo.charAt(4));
            String y1 = Character.toString(campo.charAt(6));
            String y2 = Character.toString(campo.charAt(7));
            String y3 = Character.toString(campo.charAt(8));
            String y4 = Character.toString(campo.charAt(9));

            return y1 + y2 + y3 + y4 + "-" + m1 + m2 + "-" + d1 + d2;
        }
        return null;
    }

}
