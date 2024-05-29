/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Ventanas.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaidc
 */
public class LoginFunciones {
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    public int[] iniSesion(String username,String givenPW){
        String password = "";
        int datos[] = {3,0};
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM empleado WHERE usuario =?");
                ps.setString(1, username);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()) {
                    password = rs.getString(11);
                    datos[0] = Integer.parseInt(rs.getString(1));
                }
                datos[1] = Integer.parseInt(rs.getString(12));
        } catch (SQLException e) {
            System.out.println("Error al mostrar los datos de la BD"+e);
        }
        
        if(!password.equals(givenPW)){
            datos[0] = -1;
            datos[1] = -1;
            return datos;
         }
        return datos;
    }
}
