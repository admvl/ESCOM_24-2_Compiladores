public class Auto1 {
   private String marca;
   private int anio;
   private String color;

   public Auto1(String marca, int anio, String color) {
      this.marca = marca;
      this.anio = anio;
      this.color = color;
   }

   public String toString() {
      return "Marca = " + marca + ", año = " + anio + ", color = " + color;
   }

   public static void main(String[] args) {
      Auto1 a1 = new Auto1("Honda", 1998, "plateado");
      System.out.println(a1);
   }
}