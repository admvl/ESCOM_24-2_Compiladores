class Arte {
   public String nombreObra;
   //public String tipoObra;
   public String autorObra;
   public int valorObra;
   public String lugarObra;
   
   public Arte(String autorObra, String nombreObra, int valorObra) {
      this autorObra = autorObra;
      this. nombreObra = nombreObra;
      this.valorObra = valorObra;
   }
   
   public void crear(String tipoObra) {
      if(tipoObra == "pintura")
         System.out.println("Pintar en un lienzo");
      if else(tipoObra == "escultura")
         System.out.println("Cincelar la piedra");
      if else(tipoObra == "literarura")
         System.out.println("Escribir lo que imagino");
      else
         System.out.println("No se puede crear");
   }
}

class Pintura extends Arte {
   public Pintura() {
      super();
   }
}

class Escultura extends Arte {

}

class Literartura extends Arte {

}

class Musica extends Arte {

}

public class Creacion {
   public static void main(String[] argas) {
      Pintura pin1 = new Pintura();
   }
}
