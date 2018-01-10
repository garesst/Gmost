/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garesst.gmost.recursos;

import com.garesst.gmost.modelos.conexion;

/**
 *
 * @author oscar
 */
public class VariablesAplicacion {

    private Conexion recursoConexion;
    private conexion recursoModelConexion;
    private boolean recursoLogin;

    public VariablesAplicacion() {
    }

    public VariablesAplicacion(Conexion recursoConexion, conexion recursoModelConexion, boolean recursoLogin) {
        this.recursoConexion = recursoConexion;
        this.recursoModelConexion = recursoModelConexion;
        this.recursoLogin = recursoLogin;
    }

    public Conexion getRecursoConexion() {
        return recursoConexion;
    }

    public void setRecursoConexion(Conexion recursoConexion) {
        this.recursoConexion = recursoConexion;
    }

    public conexion getRecursoModelConexion() {
        return recursoModelConexion;
    }

    public void setRecursoModelConexion(conexion recursoModelConexion) {
        this.recursoModelConexion = recursoModelConexion;
    }

    public boolean isRecursoLogin() {
        return recursoLogin;
    }

    public void setRecursoLogin(boolean recursoLogin) {
        this.recursoLogin = recursoLogin;
    }

    @Override
    public String toString() {
        return "VariablesAplicacion{" + "recursoConexion=" + recursoConexion + ", recursoModelConexion=" + recursoModelConexion + ", recursoLogin=" + recursoLogin + '}';
    }

}
