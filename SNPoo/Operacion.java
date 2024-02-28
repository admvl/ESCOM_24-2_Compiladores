 public class Operacion {
     public void suma(int x, int y) {
       int z = x + y;
       System.out.println("La suma es: " + x + " + " + y + " = " + z);
     }
     public void suma(double x, double y) {
       double z = x + y;
       System.out.println("La suma es: " + x + " + " + y + " = " + z);
     }
     public static void main(String[] args) {
       Operacion cal = new Operacion();
       cal.suma(52,32);
       cal.suma(32.3,26.5);
     }
 }
