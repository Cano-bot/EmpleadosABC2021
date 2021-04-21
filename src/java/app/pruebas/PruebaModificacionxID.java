/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pruebas;

import app.model.Empleado;
import app.persistencia.ConexionJDB;
import app.persistencia.EmpleadoDaoJDB;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Cano
 */
public class PruebaModificacionxID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = null;
        EmpleadoDaoJDB empleadoDao = new EmpleadoDaoJDB();
        ConexionJDB c = new ConexionJDB();
        Connection conexion;
        try {
            conexion = c.abrir();
            empleadoDao.cambio(1, "Sergio", "Cabrera", "CEO", 50000);
            c.cerrar(conexion);

        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectar a la base de datos: " + ex.getMessage());
            System.exit(1);
        }
    }
    
}
