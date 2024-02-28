import java.util.Scanner;
import java.util.InputMismatchException;

public class NumeroCuadrado {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        
        try {
            System.out.print("Escriba un número ");
            num = tec.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        }
         catch(InputMismatchException ex) {
             System.out.println("El número debe ser entero ");
         }
    }
}
