class Box {
  double width;
  double height;
  double depth;
  
  // Es el constructor para cubo.
  Box() {
    System.out.println("Construyendo el cubo");
    width = 10;
    height = 10;
    depth = 10;
  }

  // Es el constructor para el prisma.
  Box(int w, int h, int d) {
    System.out.println("Construyendo el prisma");
    width = w;
    height = h;
    depth = d;
  }

  // calcula y regresa el volumen
  double volume() {
    return width * height * depth;
  }
}

class BoxDemoCubo {
  public static void main(String args[]) {
  // declara, gestiona, e inicializa el objeto Box
  Box mybox1 = new Box();
  Box mybox2 = new Box(5, 6, 7);

  double vol;

  // da el volumen del primer box
  vol = mybox1.volume();
  System.out.println("El Volume es " + vol);
  // da el volumen del segundo box
  vol = mybox2.volume();
  System.out.println("El Volume es " + vol);
  }
}

