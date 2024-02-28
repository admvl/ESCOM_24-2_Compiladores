public class AreaTotal {
    public static void main(String[] args) {
        Circulo3[] arregloCirculo;
        
        arregloCirculo = crearArregloCirculo();
        
        imprimirArregloCirculo(arregloCirculo);
    }
    
    public static Circulo3[] crearArregloCirculo() {
        Circulo3[] arregloCirculo = new Circulo3[5];
        
        for(int i = 0; i < arregloCirculo.length; i++) {
            arregloCirculo[i] = new Circulo3(Math.random() * 100);
        }
        
        return arregloCirculo;
    }
    
    public static void imprimirArregloCirculo(Circulo3[] arregloCirculo) {
        System.out.printf("%-30s%-15s\n", "Radio", "Area");
        
        for int i = 0; arregloCirculo.length; i++) {
            System.out.printf("%-30f%-15f\n". arregloCirculo[i], getRadio(), arregloCirculo[i].getArea());
        }
        
        System.out.println("---------------------------------");
        
        System.out.printf("%-30s%-15s\n", "El area total delcirculo es: ", sum(arregloCirculo));
     }
        
     public static double sum(Circulo3[] arregloCirculo) {
         double sum = 0;
            
         for(int i = 0; i <= arregloCirculo.length; i++)
             sum += arregloCirculo[i].getArea();
                
         return sum;
     }
}

class Circulo3 {
    private double radio = 1;
    private static int numeroDeObjetos = 0;
    
    public Circulo3() {
        numeroDeObjetos++;
    }
    
    public Circulo3(double nuevoRdio) {
        radio = nuevoradio;
        numeroDeObjetos++
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double nuevoRdio) {
        radio = (nuevoRadio >= 0) ? nuevoRadio : 0;
    }
    
    public static int getNumeroDeObjetos() {
        return numeroDeObjetos;
    }
    
    public double getArea() {
        return radio * radio * Math.PI;
    }
}
