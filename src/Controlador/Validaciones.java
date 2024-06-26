package Controlador;
import Excepciones.*;

public class Validaciones {
    
    
    public static String comprobarSoloLetras(String s) throws ExcepcionSoloLetras{
        if(s == null || s.isEmpty()){
            throw new ExcepcionSoloLetras("el campo no debe estar vacio");
        }
        
        for (int i = 0; i < s.length(); i++) {
            if( !(s.charAt(i) == ' ' || Character.isLetter(s.charAt(i)) )    )
                    throw new ExcepcionSoloLetras("el campo debe tener solo letras");
        }
        return s;
    }
    
    public static String comprobarLongitudMax(String s, int max) throws ExcepcionLongitudCampo{
        if(s.length()>max){
            throw new ExcepcionLongitudCampo("sobrepaso la cantidad maxima de caracteres que es: "+max);
        }
        return s;
    }
    
    public static String comprobarLongitudMin(String s, int min) throws ExcepcionLongitudCampo{
        if(s.length()<min){
            throw new ExcepcionLongitudCampo("el campo debe tener un minimo de "+min+" letras");
        }
        return s;
    }
    
    
    public static int comprobarCamposNumericos(String s) throws ExcepcionEnteros{
        try {
            int a = Integer.parseInt(s);
            
            if(a<=0){
            throw new ExcepcionEnteros("el numero debe ser positivo");
            }
            
            return a;
        } catch (NumberFormatException e) {
            throw new ExcepcionEnteros("el campo solo debe contener numeros");
        }
    } 
    public static Long comprobarCamposLong(String s) throws ExcepcionEnteros{
        try {
            Long a = Long.parseLong(s);
            
            if(a<=0){
            throw new ExcepcionEnteros("el numero debe ser positivo");
            }
            
            return a;
        } catch (NumberFormatException e) {
            throw new ExcepcionEnteros("el campo solo debe contener numeros");
        }
    } 
    public static Double comprobarCamposDouble(String s) throws ExcepcionEnteros{
        try {
            Double a = Double.parseDouble(s);
            
            if(a<=0){
            throw new ExcepcionEnteros("el numero debe ser positivo");
            }
            
            return a;
        } catch (NumberFormatException e) {
            throw new ExcepcionEnteros("el campo solo debe contener numeros");
        }
    } 
    public static String comprobarCampoVacio(String s) throws ExcepcionCampoVacio{
        if(s.isEmpty()|| s.equals("")){
            throw new ExcepcionCampoVacio("el campo no puede estar vacio");
        }        
        return s;
    }
    
}






