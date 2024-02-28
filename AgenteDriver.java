class Agente {
   private static Agente listaDeAgentes = null;
   private final String NOMBRE;
   private double valor = 0.0;
   private Agente siguienteAgente;
   
   public Agente(String nombre) {
      this.NOMBRE = nombre;
      this.siguienteAgente = listaDeAgentes;
      listaDeAgentes = this;
   }
   
   private double getValor() {
      return this.valor;
   }
   
   private void addValor() {
      Scanner stdin = new Scanner(System.in);
      
      System.out.printf("Entrada %s's contribucio: " , this.NOMBRE);
      this.valor += stdin.nextDouble();
   }
   
   public static double getTodoValor() {
      double valorTotal = 0.0;
      Agente agente = listaDeAgentes;
      
      while(agente != null) {
         valorTotal += agente.getValor();
         agente = agente.siguienteAgente;
      }
      
      return valorTotal;
   }
   
   public static void addValorTotal() {
      Agente agente = listaDeAgentes;
      
      while(agente != null) {
         agente.addValor();
         agente = agente.siguienteAgente;
      }
   }
}

public class AgenteDriver {
   public static void main(String[] args) {
   
   }
}

//Libro: datan página 363
