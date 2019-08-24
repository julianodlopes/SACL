/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito verificar a data inserida pelo usuário. Função presente:
 * verificarData(); Data de criação: 05/09/2015.
 */
public class VerificarData {

    public boolean verificarData(JFormattedTextField jformatted) {
        String s = jformatted.getText();
        if (!s.equals("  /  /    ") && !s.equals("00/00/0000")) {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(s);
                return true;
            } catch (ParseException ex) {

            }
        } else {
            return true;
        }
        return false;
    }

}
