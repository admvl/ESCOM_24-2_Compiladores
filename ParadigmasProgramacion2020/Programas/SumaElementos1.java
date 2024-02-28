import java.util.*;

public class SumaElementos1 {
    static Scanner teclado = new Scanner(System.in);
    
    publis static void main(String[] args) {
        int[] elem = new int{6};
        
        int suma;
        int contador;
        
        System.out.println("Escriba seis números enteros: ");
        
        sum = 0;
        
        for(contador = 0; contador < elem.length; contador++) {
            elem[contador] = teclado.nextInt();
            suma = suma + elem[contador];
        }
    }
}
