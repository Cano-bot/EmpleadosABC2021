/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pruebas;

import app.persistencia.ConexionJDB;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Cano
 */
public class PruebaConexionJDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionJDB c = new ConexionJDB();
        Connection conexion;
        
        try {
            conexion = c.abrir();
            c.cerrar(conexion);
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectar a la base de datos: " + ex.getMessage());
            System.exit(1);
        }
        System.out.println("Prueba exitosa!");
    }
    
}
