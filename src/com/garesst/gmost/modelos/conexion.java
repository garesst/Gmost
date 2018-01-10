/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garesst.gmost.modelos;

import com.garesst.gmost.recursos.BaseDatos;
import com.garesst.gmost.recursos.RecursoConector;
import java.sql.Connection;

/**
 *
 * @author oscar
 */
public class conexion {
    private Connection conn;
    private String nomBaseDatos, url, puerto, user, password;
    private BaseDatos nomServBaseDatos;
    private RecursoConector tipo;

    public conexion() {
    }

    public conexion(Connection conn, RecursoConector tipo, BaseDatos nomServBaseDatos, String nomBaseDatos, String url, String puerto, String user, String password) {
        this.conn = conn;
        this.tipo = tipo;
        this.nomServBaseDatos = nomServBaseDatos;
        this.nomBaseDatos = nomBaseDatos;
        this.url = url;
        this.puerto = puerto;
        this.user = user;
        this.password = password;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public RecursoConector getTipo() {
        return tipo;
    }

    public void setTipo(RecursoConector tipo) {
        this.tipo = tipo;
    }

    public BaseDatos getNomServBaseDatos() {
        return nomServBaseDatos;
    }

    public void setNomServBaseDatos(BaseDatos nomServBaseDatos) {
        this.nomServBaseDatos = nomServBaseDatos;
    }

    public String getNomBaseDatos() {
        return nomBaseDatos;
    }

    public void setNomBaseDatos(String nomBaseDatos) {
        this.nomBaseDatos = nomBaseDatos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return tipo + ":" + nomServBaseDatos + "://" + url + ":" + puerto + "/" + nomBaseDatos;
    }
    
}
