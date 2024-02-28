class RefDemo {
  public static void main(String args[]) {
  BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
  Box plainbox = new Box();
  double vol;

  vol = weightbox.volume();
  System.out.println("Volume de weightbox es " + vol);
  System.out.println("Weight de weightbox es " +
    weightbox.weight);
  System.out.println();
  // asigna referencia BoxWeight a referencia a Box
  plainbox = weightbox;

  vol = plainbox.volume(); // OK, volume() definido en Box
  System.out.println("Volume de plainbox es " + vol);

  /* La siguiente sentencia es invalida por que plainbox
     no define un miembro weight. */
  // System.out.println("Weight de plainbox es " + plainbox.weight);
  }
}

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
