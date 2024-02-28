class Box {
  double width;
  double height;
  double depth;
  
  // Es el constructor para Box.
  Box() {
    System.out.println("Construyendo Box");
    width = 10;
    height = 10;
    depth = 10;
  }

  // calcula y regresa el volumen
  double volume() {
    return width * height * depth;
  }
}

class BoxDemo6 {
  public static void main(String args[]) {
  // declara, gestiona, e inicializa el objeto Box
  Box mybox1 = new Box();
  Box mybox2 = new Box();

  double vol;

  // da el volumen del primer box
  vol = mybox1.volume();
  System.out.println("El Volume es " + vol);
  // da el volumen del segundo box
  vol = mybox2.volume();
  System.out.println("El Volume es " + vol);
  }
}

