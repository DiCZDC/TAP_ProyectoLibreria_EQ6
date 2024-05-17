package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    public static final String URL = "jdbc:mysql://localhost:3306/sistemalibreria";
    public static final String USER = "root";
    public static final String CLAVE = "5691323Zvbcjc"; // Ingresa tu contraseña si tienes alguna
    
    public static void main(String[] args) {
        new Conexion().conectar();
    }
    public Connection conectar() {
        try {
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error :" + e);
        }
        return con;
    }
}
