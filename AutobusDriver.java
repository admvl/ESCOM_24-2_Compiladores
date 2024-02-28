class Prisma {
  public double ancho;
  public double alto;
  public double largo;
  
  Prisma(Prisma o) {
    ancho = o.ancho;
    alto = o.alto;
    largo = o.largo;
  }
  
  Prisma() {
    ancho = -1;
    alto = -1;
    largo = -1;
  }
  
  Prisma(double a, double al, double l) {
    ancho = a;
    alto = al;
    largo = l;
  }
  
  Prisma(double lado) {
    ancho = alto = largo = lado;
  }
  
  double volumen() {
    return ancho * alto * largo;
  }
}

class PrismaConPeso extends Prisma{
  double peso;
  
  PrismaConPeso(PrismaConPeso o) {
    super(o);
    peso = o.peso;
  }
  
  PrismaConPeso(double a, double al, double l, double m) {
    super(a, al, l);
    peso = m;
  }
  
  PrismaConPeso() {
    super();
    peso = -1;
  }
  
  PrismaConPeso(double lado, double m) {
    super(lado);
    peso = m;
  }
}

class Autobus extends PrismaConPeso {
  double costo;
  
  Autobus(Autobus o) {
    super(o);
    costo = o.costo;
  }
  
  Autobus(double a, double al, double l, double m, double c) {
    super(a, al, l, m);
    costo = c;
    }
    
  Autobus() {
    super();
    costo = -1;
  }
    
  Autobus(double lado, double m, double c) {
    super(lado, m);
    costo = c;
  }
}

class PrismaConColor extends Prisma {
   String color;
   
   PrismaConColor(double a, double al, double l, String c) {
      ancho = a;
      alto = al;
      largo = l;
      color = c;
   }
} 

class AutobusDriver {
  public static void main(String args[]) {
    Autobus autobus1 = new Autobus(10, 20, 15, 10, 3.41);
    Autobus autobus2 = new Autobus(2, 3, 4, 0.76, 1.28);
    
    double vol;
    
    vol = autobus1.volumen();
    System.out.println("El volumen del autobus1 es; " + vol);
    System.out.println("El peso del autobus1 es; " + autobus1.peso);
    System.out.println("El costo del transporte es; " + autobus1.costo);
    System.out.println();
    
    vol = autobus2.volumen();
    System.out.println("El volumen del autobus2 es; " + vol);
    System.out.println("El peso del autobus2 es; " + autobus2.peso);
    System.out.println("El costo del transporte es; " + autobus2.costo);
    
  }
}
