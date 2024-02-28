public class HiloActual {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println("Hilo actual: " + t);

        t.setName("Hilo actual");

        System.out.println("Después de cambiar de nombre: " + t);

        try {
            System.out.println(n);
            Thread.sleep(1000);
        }

        catch(InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
    }
}
