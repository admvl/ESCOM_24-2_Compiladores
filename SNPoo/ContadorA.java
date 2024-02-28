public class ContadorA {
   private int cont;
   
   public ContadorA(int cont) {
      this.cont = cont;
   }

   public String toString() {
      return Integer.toString(cont);
   }

   public static void main(String[] args) {
      ContadorA cont1 = new ContadorA(100);
      String mensaje = "El contador actualizado = " + cont1;
      System.out.println(mensaje);
   }
}
