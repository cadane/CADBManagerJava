/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import vista.login;

/**
 *
 * @author Camel Negrete A <camelnegrete@gsoft.com.co>
 */
public class Principal {

    public static void main(String[] args) {
        login lgForm = new login();
        lgForm.setVisible(true);
        lgForm.setTitle("Inicar sesion");
        lgForm.cargarImagen();
    }
}
