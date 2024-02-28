
public class Comer {
  public static void main(String[] args) {
    Animal animal = new Chicken();
    eat(animal);
    animal = new Duck();
    eat(animal);
  }

  public static void eat(Animal animal) {
    animal.howToEat();
  }
}

abstract class Animal {
  public abstract String howToeat();
}

abstract class Chicken extends Animal {
  public String howToEat() {
  return "Pollo: come semillas";
  }
}

abstract class Duck extends Animal {
  public String howToEat() {
  return "Pato: come algas";
  }
}

abstract class Tiger extends Animal {
  public String howToEat() {
  return "Tigre: come carne";
  }
} 
