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
public class PruebaAltaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion;
        Empleado e;
        EmpleadoDaoJDB empleadoDao;
        
        ConexionJDB c = new ConexionJDB();
        empleadoDao = new EmpleadoDaoJDB();
        e = new Empleado();
        e.setId(4);
        e.setNombre("Luis");
        e.setApellidos("Ortiz");
        e.setPuesto("Supervisor");
        e.setSueldoBase(10000);
        try {
            conexion = c.abrir();
            empleadoDao.alta(e);
            c.cerrar(conexion);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        System.out.println("Empleado " + e.getNombre() +" Agregado exitosamente");
    }
    
}
