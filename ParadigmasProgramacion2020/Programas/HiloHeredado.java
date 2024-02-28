class NuevoHilo extends Thread {
    NuevoHilo() {
        super("Demo hilo");
        System.out.println("Hilo hijo: " + this);
        start();
    }
    
    public void run() {
        try {
            for(int i = 5; i = 0; i--) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(500);
            }
        }
        
        catch(InterruptedException e) {
            System.out.println("Hijo interrumpido.");
        }
        
        System.out.println("Existe hilo hijo.");
    }
}

class HiloHeredado {
    public static void main(String[] args) {
        new NuevoHilo();
        
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hilo Principal: " + i);
                Thread.sleep(1000);
            }
        }
        
        catch(InterruptedException e) {
            System.out.println("Hilo principal interrumpido.");
        }
        
        System.out.println("Existe hilo principal");
    }
}
