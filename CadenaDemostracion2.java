public class CadenaDemostracion2 {
    public static void main(String args[]) {
        String cadenaO1 = "Primera cadena";
        String cadenaO2 = "Segunda cadena";
        String cadenaO3 = cadenaO1;
        
        System.out.println("Longitud de cadenaO1: " +
        cadenaO1.length());
        
        System.out.println("Caracter en el indice 3 de cadenaO1, es: " +
        cadenaO1.charAt(3));
        
        if(cadenaO1.equals(cadenaO2))
            System.out.println("cadenaO1 == cadenaO2");
        else
            System.out.println("cadenaO1 != cadenaO2");
            
        if(cadenaO1.equals(cadenaO3))
            System.out.println("cadenaO1 == cadenaO3");
        else
            System.out.println("cadenaO1 != cadenaO3");
    }
}
