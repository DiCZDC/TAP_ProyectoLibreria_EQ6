/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Zaidc
 */
public class ExcepcionCampoVacio extends Exception{

    public ExcepcionCampoVacio() {
    }
    public ExcepcionCampoVacio(String mensaje) {
        super(mensaje);
    }
}