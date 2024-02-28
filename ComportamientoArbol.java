class ReinoVegetal {
   public String nombre;
   public String clima;
   public int tiempoVida;
   
   public ReinoVegetal(String nombre, String clima, int tiempoVida) {
      this.nombre = nombre;
      this.clima = clima;
      this.tiempoVida = tiempoVida;
   }
   
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
   public String getNombre() {
      return nombre;
   }
   
   public void setTiempoVida(int tiempoVida) {
      this.tiempoVida = tiempoVida;
   }
}

class Arbol extends ReinoVegetal {
   public double altura;
   public String tipo;
   
   public Arbol(String nombre, String clima, int tiempoVida) {
      super(nombre,clima,tiempoVida);
      
      for( int i = 0; i < tiempoVida; i++) {
         altura += 0.7;
      }
          
   }
   
   public double getCrecimiento() {
      return altura;
   }
   
   public void visualizarCrecimiento() {
      System.out.println("La altura del árbol, es: " + altura);
       
   }
   
   public String getClima() {
      return clima;
   }
}

class HiervaMedicinal {
   public String molestia;

   public void curar() {

   }

}

class HiervaOrnato {

}

public class ComportamientoArbol {
   public static void main(String[] args) {
      Arbol a = new Arbol("Encino ", "Desértico ", 22);
      
      a.visualizarCrecimiento();
      System.out.println("El " + a.getNombre() + " de clima " + a.getClima() + " tiene una altura de " + a.getCrecimiento());
   }
}
