// Este programa usa herencia para extender Box.
class Box {
  double width;
  double height;
  double depth;

  // construir clone de un object
  Box(Box ob) { // pasa object al constructor
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // constructor usado cuando todas las dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // constructor
  Box() {
    width = -1; // usa -1 para indicate
    height = -1; // un no uninitialized
    depth = -1; // box
  }

  // constructor usado cuando cube es creado
  Box(double len) {
    width = height = depth = len;
  }

  // calcular y return volume
  double volume() {
    return width * height * depth;
  }
}

// Aqui, Box es extended para incluir weight.
class BoxWeight extends Box {
  double weight; // weight de box

  // constructor para BoxWeight
  BoxWeight(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}

class DemoBoxWeight {
  public static void main(String args[]) {
    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
    double vol;

    vol = mybox1.volume();
    System.out.println("Volumen de mybox1 es " + vol);
    System.out.println("Weight de mybox1 es " + mybox1.weight);
    System.out.println();

    vol = mybox2.volume();
    System.out.println("Volumen de mybox2 es " + vol);
    System.out.println("Weight de mybox2 es " + mybox2.weight);
  }
}


