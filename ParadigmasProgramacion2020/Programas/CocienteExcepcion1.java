import java.util.*;

public class CocienteExcepcion1 {
    static Scanner consola = new Scanner(System.in);
    
    public static void main(String[] args) {
        int dividendo, divisor,cociente;
        
        try {
            System.out.println("Linea 10: Escribe el " + "dividendo: ");
            dividendo = consola.nextInt();
            System.out.println();
            
            System.out.print("Linea 13: Escribir el " + "divisor: ");
            divisor = consola.nextInt();
            System.out.println();
            
            cociente = divid
            endo/divisor;
            System.out.print("Linea 17: cociente = " + cociente);
        }
        catch(ArithmeticException aRef) {
            System.out.println("Linea 21: Excepción " + aRef);
        }
        catch(InputMismatchException iRef) {
            System.out.println("Linea25: Excepción " + iRef);
        }
    }
}
