class Bike {
   protected final int MAX_SPEED = 50;
   protected int speed = 0;

   public void setSpeed(final int speed) {
       this.speed = speed;
   }

   public final void run() {
       System.out.println("running");
   }
}

public final class Honda extends Bike {
  public static void main(String args[]) {
      Honda honda = new Honda();
      honda.run();
  }
}
