/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garesst.gmost.recursos;

import com.garesst.gmost.modelos.conexion;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class Conexion {

    Connection conn = null;
    private String url, user, password;

    public Connection getConn(conexion objeConexion) {
        try {
            url = objeConexion.toString();
            user = objeConexion.getUser();
            password = objeConexion.getPassword();
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            System.err.println("Conexion realizada");
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return conn;
    }

    public ArrayList<String> obtenerBasesDatos(Connection conexion) {
        ArrayList<String> model = new ArrayList<String>();
        model.add(0, "Ninguna");
        try {
            DatabaseMetaData meta = conexion.getMetaData();
            ResultSet res = meta.getCatalogs();
            while (res.next()) {
                String db = res.getString("TABLE_CAT");
                model.add(db);
            }
            res.close();
        } catch (Exception e) {
        }
        return model;
    }
}
