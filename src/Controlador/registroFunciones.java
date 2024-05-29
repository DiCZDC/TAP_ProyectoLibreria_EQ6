/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaidc
 */
public class registroFunciones {
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    public ArrayList<String[]> leerDatos(String tituloTabla, int ancho){
       
       ArrayList <String[]> dataTabla = new ArrayList <String[]>();
       
       try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM "+tituloTabla);
            while (rs.next()) {
                String[] aux = new String[ancho];
                for(int i = 0; i < ancho; i++)
                    aux[i]=(rs.getString(i+1));
                dataTabla.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los datos de la BD");
        }
       
       return dataTabla;
    }
    
    
    
    public boolean regAutor(String nombre,String pais, String idioma,String pagWeb){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO autor (nombre,pais,idiomaOrigen,url) VALUES (?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, pais);
            ps.setString(3, idioma);
            ps.setString(4, pagWeb);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            
        } catch (SQLException e) {
            System.out.println("Error al insertar los productos en la BD "+e);
            return false;
        }
        return true;
    }
    public boolean editarAutor(String nombre, String pais, String idioma, String pagWeb, int id){
            try {
                PreparedStatement ps = cn.prepareStatement("UPDATE autor SET nombre=?,pais=?,idiomaOrigen=?,url=? WHERE idAutor=?");
                ps.setString(1, nombre);
                ps.setString(2, pais);
                ps.setString(3, idioma);
                ps.setString(4, pagWeb);
                ps.setInt(5, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
                
            } catch (SQLException e) {
                System.out.println("Error al actualizar los productos en la BD "+e);
                return false;
            }
        
        return true;
    }
}
