public class NumerosPrimos {
  public int numeroP;
  public int numeroA;
  public double residuo;
  
  public void imprimirNumerosPrimos(int numerosPrimos) {
    final int N = 10;
    int cuenta = 0;
    int n = 2;
    
    while(cuenta < numerosPrimos) {
      if(esPrimo(n)) {
        cuenta++;
        
        if(cuenta % N == 0) {
          System.out.printf("%-5s\n", n);
        }
        else {
          System.out.printf("%-5s", n);
        }
        
        
      }
      n++;
    }
  }
  
  public boolean esPrimo(int numeroP) {
    for(int numeroA = 2; numeroA <= numeroP; numeroA++) {
      if(numeroP % numeroA == 0) {
        return false;
      }
      else {
        return true;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    NumerosPrimos p = new NumerosPrimos();
    
    System.out.println("Los números primos, son: \n");
    p.imprimirNumerosPrimos(50);
    
  }
}
       
