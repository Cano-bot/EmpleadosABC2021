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
public class PruebaConsultaxID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Abrir BD
        Empleado e = null;
        EmpleadoDaoJDB empleadoDao = new EmpleadoDaoJDB();
        ConexionJDB c = new ConexionJDB();
        Connection conexion;
        
        try {
            conexion = c.abrir();
//            c.abrir();
            e = empleadoDao.consulta(1);
            c.cerrar(conexion);
            if(e ==  null){
                System.out.println("Empleado inexistente");
                System.exit(1);
            }
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectar a la base de datos: " + ex.getMessage());
            System.exit(1);
        }
        System.out.println("Id: " + e.getId());
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Apellidos: " + e.getApellidos());
        System.out.println("Puesto: " + e.getPuesto());
    }
    
}
