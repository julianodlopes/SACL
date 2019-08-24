/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito armazenar durante toda a execução do programa o nome do usuário
 * conectado. Funções presente: setUsuarioAtual(); getUsuarioAtual(); Data de
 * criação: 05/09/2015.
 */
public class UsuarioAtual {

    //Guarda o usuário conectado durante a execução do programa.
    public static String usuarioAtual;

    public void setUsuarioAtual(String usuario) {
        usuarioAtual = usuario;
    }

    public String getUsuarioAtual() {
        return usuarioAtual;
    }

}
