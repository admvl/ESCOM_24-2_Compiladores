class NuevoHilo implements Runnable {
    Thread t;

    NuevoHilo() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Hilo hijo: " + t);
        t.start();
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e) {
            System.out.println("Hijo interrumpido. ");
        }

        System.out.println("Existe un hilo hijo.");
    }
}

public class HiloDemo {
    public static void main(String[] args) {
        new NuevoHilo();

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Hilo principal: " + i);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e) {
            System.out.println("Hilo principal interrumpido.");
        }

        System.out.println("Existe hilo principal.");
    }
}
