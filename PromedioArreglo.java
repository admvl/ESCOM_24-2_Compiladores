public class PromedioArreglo {
   public static void main(String[] args) {
      final int NUMERO_DE_ELEMENTOS = 3;
      double[] numero = new double[NUMERO_DE_ELEMENTOS];

      
      java.util.Scanner entrada = new java.util.Scanner(System.in);
      
      for(int i = 0; i < NUMERO_DE_ELEMENTOS; i++){
         System.out.println("Escribir el número");
         numero[i] = entrada.nextDouble();
      }
      

      System.out.println("El número, es: " + numero[2]);
   }
}
