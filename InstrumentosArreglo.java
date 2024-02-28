public class InstrumentosArreglo {
   public static void main(String[] args) {
      final int NUMERO_DE_INSTRUMENTOS = 3;
      String nombre[] = new String[NUMERO_DE_INSTRUMENTOS];

      
      java.util.Scanner entrada = new java.util.Scanner(System.in);
      
      for(int i = 0; i < NUMERO_DE_INSTRUMENTOS; i++){
         System.out.println("Escribir el nombre del instrumento");
         nombre[i] = entrada.nextLine();
      }
      
      int n = 0;
      
      System.out.println("El instrumento, es: " + nombre[n++]);
      System.out.println("El instrumento, es: " + nombre[n++]);
      System.out.println("El instrumento, es: " + nombre[n++]);
   }
}
