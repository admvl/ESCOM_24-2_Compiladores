class ImprimirCar implements Runnable {
    private char carAimp;
    private int veces;

    public ImprimirCar(char c, int t) {
        carAimp = c;
        veces = t;
    }

    public void run() {
        for(int i = 0; i < veces; i++) {
            System.out.println(carAimp);
        }
    }
}

class ImprimirNum implements Runnable {
    private int ulNum;

    public void imprimirNum(int n) {
        ulNum = n;
    }

    public void run() {
        for(int i = 0; i < ulNum; i++) {
            System.out.println(" " + i);
        }
    }
}

public class TareaHilo {
    public static void main(String[] args) {
        Runnable impA = new ImprimirCar('a', 100);
        Runnable impB = new ImprimirCar('b', 100);
        Runnable imp100 = new ImprimirNum(100);

        Thread hilo1 = new Thread(impA);
        Thread hilo2 = new Thread(impB);
        Thread hilo3 = new Thread(imp100);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
