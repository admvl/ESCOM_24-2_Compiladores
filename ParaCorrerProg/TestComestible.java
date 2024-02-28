interface Edible {
  /** Describe como come */
  public abstract String howToEat();
}


public class TestComestible {
  public static void main(String[] args) {
  Object[] objects = {new Tiger(), new Chicken(), new Apple()};
  for (int i = 0; i < objects.length; i++)
  if (objects[i] instanceof Edible)
  System.out.println(((Edible)objects[i]).howToEat());
  }
}

class Animal {
  // Campos de datos, constructores, y metodos omitidos
}

class Chicken extends Animal implements Edible {
  public String howToEat() {
  return "Pollo: come semillas";
  }
}

class Duck extends Animal {
  public String howToEat() {
  return "Come algas";
  }
} 

class Tiger extends Animal {
}

abstract class Fruit implements Edible {
  // Campos de datos, constructores, y metodos omitidos
}

class Apple extends Fruit {
  public String howToEat() {
  return "Apple: se parte";
  }
}

class Orange extends Fruit {
  public String howToEat() {
  return "Orange: se hace jugo";
  }
}


  



