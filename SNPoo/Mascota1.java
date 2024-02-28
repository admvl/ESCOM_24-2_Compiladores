import java.util.Scanner;

public class Mascota1 {
   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      Object o1;
      
      System.out.println("¿Qué tipo de mascota prefiere?\n" +
       "Escriba p para perro o g para gato: ");
       
      if(stdIn.next().equals("p")) {
         o1 = new Perro();
      }
      else {
         o1 = new Gato();
      }
      
      if(o1 instanceof Perro) {
         System.out.println("Mueve la cola");
      }
      else {
         System.out.println("Araña");
      }
   }
}

class Perro {
   public String toString() {
      return "Gua gua ";
   }
}

class Gato {
   public String toString() {
      return "Miau miau ";
   }
}
