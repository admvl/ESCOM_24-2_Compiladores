public class Estudiante {
         public String nombre;
         public int calificacion;
         public String direccion;
         
         public Estudiante(String nombre, int calificacion) {
            this.nombre = nombre;
            this.calificacion = calificacion;
         }
         
         public void setNombre(String nombre) {
            this.nombre = nombre;
         }
         
         public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
         }
         
         public String getNombre() {
            return nombre;
         }
         
         public int getClificacion() {
            return calificacion;
         }
}

public class EstudianteListaEnlazada {
         private NodoEstudiante cabeza;
         
         private class NodoEstudiante {
            private Estudiante dato;
            private NodoEstudiante siguiente;
         
            public NodoEstudiante(Estudiante e, NodoEstudiante inicio) {
               dato = e;
               siguiente = inicio;
            }
         
            public Estudiante getDato() {
               return dato;
            }
         
            public void setDato(Estudiante e) {
               dato = e;
            }
         
            public NodoEstudiante getSiguiente() {
               return siguiente;
            }
         
            public void setSiguiente(NodoEstudiante nodo) {
               siguiente = nodo;
            }
         }
         
         public void add(Estudiante e) {
            cabeza = new NodoEstudiante(e, cabeza);
         }
         
         public void borrar(String nombre) {
            if(cabeza == null) {
               return;
            }
            
            if(cabeza.getDato().getNombre():equals(nombre)) {
               cabeza = cabeza.getSiguiente();
            }
            
            else {
               for(NodoEstudiante temp = cabeza.getSiguiente() , previo = cabeza; temp != null; temp = temp.getSiguiente()) {
                  if(temp.getDato().getNombre().equals(nombre)) {
                     previo.setSiguiente(temp.getSiguiente());
                     return;
                  }
               }
            }
         }
         
         public void visualizarLista() {
            System.out.println("Lista: ");
            
            for( NodoEstudiante temp = cabeza; temp != null; temp.getSiguiente()) {
               System.out.println(temp.getDato() + " ");
            }
         }
}

public class ListaEstudianteDriver {
   public static void main(String[] argas) {
      
   }
}
