/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garesst.gmost;

import com.garesst.gmost.recursos.VariablesAplicacion;
import com.garesst.gmost.vistas.frmConexion;

/**
 *
 * @author oscar
 */
public class main {
    public static VariablesAplicacion variablesAplicacion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        variablesAplicacion = new VariablesAplicacion();
        frmConexion frm = new frmConexion();
        frm.setVisible(true);
    }
    
}
