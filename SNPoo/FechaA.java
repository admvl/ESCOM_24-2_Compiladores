public class FechaA {
   private int dia;
   private int mes;
   private int anio;

   public FechaA() {
      dia = 1;
      mes = 1;
      anio = 1998;
   }

   public FechaA(int d1, int m1, int a1) {
      dia = d1;
      mes = m1;
      anio = a1;
   }

   public boolean equals(Object ob1) {
      if(!(ob1 instanceof FechaA))
         return false;
      FechaA ob2 = (FechaA) ob1;
      return ob2.dia == dia && ob2.mes == mes && ob2.anio == anio;
   }

   public String toString() {
      return dia + "/" + mes + "/" + anio;
   }
   
   public static void main(String[] args) {
      FechaA f1 = new FechaA(28,2,2022);

      System.out.println(f1.toString());
     
   
   }
}
