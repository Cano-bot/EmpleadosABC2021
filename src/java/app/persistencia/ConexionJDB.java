/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cano
 */
public class ConexionJDB implements ConexionI {
    
    private Connection conexion;
    private String URL = "jdbc:derby://localhost:1527/miempresa";
    private String usuarioBD = "root";
    private String contrasenaBD = "root";
    
    @Override
    public void cerrar(Connection c) throws SQLException {
        c.close();
    }

    @Override
    public Connection abrir() throws SQLException {
        Connection c;
        c = DriverManager.getConnection(URL, usuarioBD, contrasenaBD);
        return c;
    }
    
}
