class Botellas {
   private static final int LIMITE = 4;
   private static int costoTotal = 0;
   private int costo = 0;
   
   public int getCosto() {
      return this.costo;
   }

   public static int getCostoTotal() {
      return Botellas.costoTotal;
   }
   
   public void addCosto() {
      this.costo++;
      Botellas.costoTotal++;
      
      if(Botellas.costoTotal >= Botellas.LIMITE) {
         System.out.println("Límite de compras");
      }
   }
}

public class CompraBotellas {
   public static void main(String[] args) {
      Botellas b1 = new Botellas();
      Botellas b2 = new Botellas();
      Botellas b3 = new Botellas();
      
      b1.addCosto();
      b1.addCosto();
      b2.addCosto();
      b3.addCosto();
      
      System.out.println(b1.getCosto());
      System.out.println(Botellas.getCostoTotal());
   }
}
