public class NumerosArreglo {
    public static void main(String[] args) {
        final int NUMERO_DE_ELEMENTOS = 5;
        double[] num = new double[NUMERO_DE_ELEMENTOS];
        double sum = 0;
        
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        for(int i = 0; i < NUMERO_DE_ELEMENTOS; i++) {
            num[i] = entrada.nextDouble();
            sum += num[i];
        }
        
        double promedio = sum/NUMERO_DE_ELEMENTOS;
        
        int contador = 0;
        
        for(int i = 0; i < NUMERO_DE_ELEMENTOS; i++) {
            if(num[i] > promedio)
                contador++;
                
        System.out.println("El promedio es " + promedio);
        System.out.println("El número de elementos que hay en el promedio, es; " + contador);
        }
    }
}
