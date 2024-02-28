class NuevoHilo implements Runnable {
    String nombre;
    Thread t;
    
    NuevoHilo(String nombreHilo) {
        nombre = nombreHilo;
        t = new Thread(this, nombre);
        System.out.println("Nuevo hilo: " + t);
        t.start();
    }
    
    public void run() {
        try {
            for/int i = 5; i > 0; i--) {
                System.out.println(nombre + " : " + i);
                Thread.sleep(1000);
            } 
        }
        
        catch(InterruptedException e) {
            System.out.println("Interrumpido");
        }
        
        System.out.println(nombre + " existe ");
    }
}

class MultiHiloD {
    public static void main(String[] args) {
        new nuevoHilo("Uno");
        new nuevoHilo("Dos");
        new nuevoHilo("Tres");
        
        try {
            Thread.sleep(1000);
        }
        
        catch(InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
        
        System.out.println("Hilo principal existe.");
    }
}
