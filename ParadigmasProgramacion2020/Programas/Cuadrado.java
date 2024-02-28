import java.util.*;

public class Cuadrado {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double numero;
        
        System.out.println("Linea 7: el cuadrado de 5.0 = " + cuadrado(5.0));
        
        numero = cuadrado(8.25);
        System.out.println("Linea 10: numero = ");
        imprimirNum(numero);
        System.out.println();
        
        System.out.println("Linea 14: Escribir un numero: ");
        numero = console.nextDouble();
        System.out.println();
        
        imprimirCuadrado(numero);
    }
    
    public static double cuadrado(double num) {
        return num * num;
    }
    
    public static void imprimirNum(double x) {
        System.out.print(x);
    }
    
    public static void imprimirCuadrado(double x) {
        System.out.println("El cuadrado de " + x + " = " + cuadrado(x));
    }
}
