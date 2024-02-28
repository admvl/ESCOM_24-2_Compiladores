public class Auto {
   private String marca;
   private int anio;
   private String color;

   public Auto(String marca, int anio, String color) {
      this.marca = marca;
      this.anio = anio;
      this.color = color;
   }

   public boolean equals(Auto unAuto) {
      return unAuto != null && anio == unAuto.anio &&
             color.equals(unAuto.color);
   }
   
   public static void main(String[] args) {
      Auto c1 = new Auto("Honda", 2008, "rojo");
      Auto c2 = c1;
      Auto c3 = new Auto("Honda", 2008, "amatillo");
      
      System.out.println(c2 == c1);
      System.out.println(c2.equals(c3));
   }
}
