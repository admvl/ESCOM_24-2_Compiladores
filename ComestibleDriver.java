 interface Comestible {
         /** Describe cómo se comen */
         public String comoSeCome();
 }
 
 abstract class Animal {
         // Se omiten campos de datos, constructores, y métodos
         abstract String queCome();
 }
       
 class Pollos extends Animal implements Comestible {
         public String comoSeCome() {
           return "Los pollos: Se frien";
         }

         public String queCome(){
            return "Come maíz";
         }
 }

 class Tigre extends Animal implements Comestible {
         public String comoSeCome() {
            return "El tigre: no se come";
         }

          public String queCome(){
            return "Come carne";
         }
 }
       
 abstract class Frutas implements Comestible {
         // Se omiten campos de datos, constructores, y métodos
 }

 class Manzanas extends Frutas {
         public String comoSeCome() {
           return "Manzanas: Se hacen sidra";
         }
 }

 class Naranjas extends Frutas {
         public String comoSeCome() {
           return "Naranjas: Se hacen jugo";
         }
 }
       
 public class ComestibleDriver {
         public static void main(String[] args) {
           Object[] objectos = {new Tigre(), new Pollos(), new Manzanas()};
           Object[] objectos1 = {new Tigre(), new Pollos()};
           
           System.out.println();
           
           for (int i = 0; i < objectos.length; i++)
             if (objectos[i] instanceof Comestible)
               System.out.println(((Comestible)objectos[i]).comoSeCome());

           System.out.println();

           for (int i = 0; i < objectos1.length; i++)
             if (objectos1[i] instanceof Animal)
               System.out.println(((Animal)objectos[i]).queCome());
         }
 }
