class TestIface3 {
  public static void main(String args[]) {
    Callback c = new Client();
    Callback ob = new AnotherClient();
    c.callback(42);
    c = ob; // c se refiere al objeto AnotherClient
    c.callback(42);
  }
}

class Client implements Callback {
  // Implementa la interfaz Callback
  public void callback(int p) {
    System.out.println("callback called with " + p);
  }

  void nonIfaceMeth() {
  System.out.println("Classes que implementa interfaces" +
    "puede tambien definir otros miembros, tambien.");
  }
}

// Otra implementacion de Callback.
class AnotherClient implements Callback {
  // Implementa la interfaz Callback
  public void callback(int p) {
    System.out.println("Otra version de callback");
    System.out.println("p al cuadrado es" + (p*p));
  }
}

interface Callback {
  void callback(int param);
}


