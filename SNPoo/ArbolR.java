public class ArbolR {
          int altura;

          ArbolR() {
             visualizar ("Plantando un retoño");
             altura = 0;
          }

          ArbolR(int i) {
             visualizar("Creando un nuevo arbol que tiene "
             + i + " metros de alto");
             altura = i;
          }

          void info() {
             visualizar("E1 arbol tiene " + altura
               + " metros de alto");
          }

          void info(String s) {
             visualizar(s + " : El arbol tiene "
               + altura + " metros de alto");
          }

          static void visualizar(String s) {
             System.out.println(s);
          }
    
          public static void main(String[] args) {

             for(int i = 0; i < 7; i++) {
                 ArbolR t = new ArbolR(i);
                 t.info();
                 t.info("metodo sobrecargado");
             } 
             System.out.println("y ya florece con jacarandas");
          }
       }
