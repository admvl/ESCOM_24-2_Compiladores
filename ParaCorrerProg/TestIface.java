class TestIface {
  public static void main(String args[]) {
  Callback c = new Client();
  c.callback(42);
  }
}

class Client implements Callback {
  // Implementa la interfaz Callback
  public void callback(int p) {
    System.out.println("callback llamado con " + p);
  }

  void nonIfaceMeth() {
  System.out.println("Classes que implementa interfaces" +
    "puede tambien definir otros miembros, tambien.");
  }
}

interface Callback {
  void callback(int param);
}
