/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaidc
 */
public class registroFunciones {
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    //GENERALES
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
    public int getId(String tituloTabla,String referencia,String datoBusqueda, int pos){
        int idDevuelta = 0;
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM "+tituloTabla+" WHERE "+referencia);
            ps.setString(1, datoBusqueda);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                idDevuelta = Integer.parseInt(rs.getString(pos));
        } catch (SQLException ex) {
            Logger.getLogger(registroFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idDevuelta;
    }
    public ArrayList<String> cboArray(String tituloTabla,int pos){
        ArrayList<String> salida = new ArrayList<String>();
        try {
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM "+tituloTabla);
            while (rs.next()) 
                salida.add(rs.getString(pos));
            
            
        } catch (SQLException ex) {
            System.out.println("Error al mostrar los datos de la BD"+ex);
        }
        return salida;
    }
    
    //Autor exclusivas
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
    
    
    //EDITORIAL EXCLUSIVAS
    
    public boolean regEditorial(String nombre,int telefono, String pagWeb,String email,String direccion){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO editorial (nombre,telefono,url,email,direccion) VALUES (?,?,?,?,?)");
                ps.setString(1, nombre);
                ps.setInt(2, telefono);
                ps.setString(3, pagWeb);
                ps.setString(4, email);
                ps.setString(5, direccion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            
        } catch (SQLException e) {
            System.out.println("Error al insertar los productos en la BD "+e);
            return false;
        }
        return true;
    }
    public boolean editarEditorial(String nombre,int telefono, String pagWeb,String email,String direccion,int id){
            try {
                PreparedStatement ps = cn.prepareStatement("UPDATE editorial SET nombre=?,telefono=?,url=?,email=?,direccion=? WHERE idEditorial=?");
                ps.setString(1, nombre);
                ps.setInt(2, telefono);
                ps.setString(3, pagWeb);
                ps.setString(4, email);
                ps.setString(5, direccion);
                ps.setInt(6, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
                
            } catch (SQLException e) {
                System.out.println("Error al actualizar los productos en la BD "+e);
                return false;
            }
        return true;
    }
    
    //LIBRO EXCLUSIVAS
    
    public boolean regLibro(int idAutor,int idEditorial,long barcode,String ISBN, String titulo,Double precio){
        System.out.println(idEditorial);
        try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO libro (codigoBarras,existencia_tienda,ISBN,titulo,precio,existencia_total, idEditorial) VALUES (?,?,?,?,?,?,?)");
                
                ps.setLong(1, barcode);
                ps.setInt(2, 0);
                ps.setString(3, ISBN);
                ps.setString(4, titulo);
                ps.setDouble(5, precio);
                ps.setInt(6,0);
                ps.setInt(7, idEditorial);
                ps.executeUpdate();
                
                PreparedStatement ps2 = cn.prepareStatement("INSERT INTO escribir (codigoBarras,idAutor) VALUES(?,?)");
                ps2.setLong(1, barcode);
                ps2.setInt(2, idAutor);
                ps2.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
                
            } catch (SQLException e) {
                System.out.println("Error al guardar los productos en la BD "+e);
                return false;
            }
        return true;
    }
    
    //CAPACITACION EXcLUSIVa
    
    public boolean regCapacitacion(int idEmpleadoBodega, String capacitacion){
        try {
            PreparedStatement ps =cn.prepareStatement("INSERT INTO capacitacion(idEmpleadoBodega,capacitacion) VALUES(?,?)");
            ps.setInt(1, idEmpleadoBodega);
            ps.setString(2, capacitacion);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("error al agregar la capacitacion "+e);
            return false;
        }
    }
    
    
}
