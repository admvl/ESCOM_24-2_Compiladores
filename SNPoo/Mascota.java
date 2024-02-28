import java.util.Scanner;

public class Mascota {
   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      Object o1;

      System.out.println("¿Qué tipo de mascota prefiere?\n" +
       "Escriba p para perro o g para gato: ");
      
      if(stdIn.next().equals("g")) {
         o1 = new Perro();
      }
      else {
         o1 = new Gato();
      }

      System.out.println(o1.toString());
      System.out.println(o1);
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
