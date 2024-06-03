package Controlador;


public class Validaciones {
    
    public static String comprobarSoloLetras(String s) throws ExcepcionSoloLetras{
        if(s == null || s.isEmpty()){
            throw new ExcepcionSoloLetras("el campo no debe estar vacio");
        }
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
                throw new ExcepcionSoloLetras("el campo debe tener solo letras");
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
    
    public static String comprobarCampoVacio(String s) throws ExcepcionCampoVacio{
        if(s.isEmpty()|| s.equals("")){
            throw new ExcepcionCampoVacio("el campo no puede estar vacio");
        }        
        return s;
    }
    
}

class ExcepcionSoloLetras extends Exception{

    public ExcepcionSoloLetras() {}
    public ExcepcionSoloLetras(String mensaje){
        super(mensaje);
    }
}

class ExcepcionEnteros extends Exception{

    public ExcepcionEnteros() {
    }
    public ExcepcionEnteros(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionCampoVacio extends Exception{

    public ExcepcionCampoVacio() {
    }
    public ExcepcionCampoVacio(String mensaje) {
        super(mensaje);
    }
}
