/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author juanr
 */
public class Comprueba {
     static boolean vacio(JTextField campo) {
        return "".equals(campo.getText().trim());
    }

    static void alertaVacio(Component padre, JTextField campo) {
        JOptionPane.showMessageDialog(padre, "El campo  no puede quedar vacío", "Campo obligatorio", JOptionPane.ERROR_MESSAGE);
        campo.setBackground(Color.red);
    }
}
