/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionMySql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Elmer Cardoza
 */
public class Conexion {

    private Connection ConexionBD;

    public Conexion() {
        try {
            ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/lab2", "root", "root");
            System.out.println("Conectado a la BD");
        } catch (Exception e) {
            System.err.println("Error de conexion" + e);
        }

    }

    public Connection retornarConexion() {
    return ConexionBD;
    }
}
