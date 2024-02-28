class Persona {
         private String nombre = "";

         public Persona() {

         }
         
         public Persona(String nombre) {
           this.nombre = nombre;
         }
         
         public String getNombre() {
           return this.nombre;
         }
} // fin de la clase Persona
       
class Gerente2 extends Persona {
         public Gerente2(String nombre) {
           super(nombre);
         }
       } // fin de la clase Gerente2
       
class Empleado extends Persona {
         private int id = 0;

         public Empleado() {
        
         }
         
         public Empleado(String nombre, int id) {
           super(nombre);
           this.id = id;
         }
         
         public void mostrar() {
           System.out.println("nombre: " + getNombre());
           System.out.println("id: " + id);
         }
} // fin de la clase Empleado
       
class TiempoCompleto extends Empleado {
         private double salario = 0.0;

         public TiempoCompleto() { 
         
         }
         
         public TiempoCompleto(String nombre, int id, double salario) {
           super(nombre, id);
           this.salario = salario;
         }
         
         public void mostrar() {
           super.mostrar();
           System.out.printf("salario: $%,.0f\n", salario);
         }
} // fin de la clase TiempoCompleto
       
public class TiempoCompletoDriver {
         public static void main(String[] args) {
         TiempoCompleto tiempoCompleto = new TiempoCompleto("Shreya", 5733, 80000);
         tiempoCompleto.mostrar();
         System.out.println(tiempoCompleto.getNombre());
       }
} // fin de la clase TiempoCompletoDriver
