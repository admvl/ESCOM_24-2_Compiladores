abstract class Trabajadores {
    String area;
    String tarea;
         
    public abstract void tarea(); 
}
     
class Personas extends Trabajadores {
    String nombre;
    int clabeEmpleado;
         
    public Personas(String nombre, int clabeEmpleado) {
        this.nombre = nombre;
        this.clabeEmpleado = clabeEmpleado;
    }    

    public void tarea() {
        System.out.println(" coloca un toldo durante 3 minutos"); 
    }
     
}
     
class Robots extends Trabajadores {
    String numeroRobot;
    
    public Robots(String numeroRobot) {
        this.numeroRobot = numeroRobot;
    }
     
    public void tarea() {
       System.out.println(" solda una pieza de giro durante 15 minutos");  
    }
     
}

public class TrabajoMixto {
    public static void main(String[] args) {
        Personas p = new Personas("El señor moreno", 222);
        Robots r = new Robots("El R1");
        
        System.out.println(p.nombre);
        p.tarea();
        System.out.println(r.numeroRobot);
        r.tarea();
    }
}
