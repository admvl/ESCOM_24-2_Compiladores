class EstadoSwitch {
  public static void main(String args[]) {
      String estado = "q1";
      char c;
      c = 'a';
      switch(estado) {
        case "q0":
          if(c == 'a')
            System.out.println("Estado es q1");
          else
            System.out.println("Estado es q0");
          break;
        case "q1":
          if(c == 'a')
            System.out.println("Estado es q1");
          else
            System.out.println("Estado es q2");
          break;
        case "q2":
          if(c == 'a')
            System.out.println("Estado es q1");
          else
            System.out.println("Estado es q3");
          break;
        case "q3":
          if(c == 'a')
            System.out.println("Estado es q1");
          else
            System.out.println("Estado es q0");
          break;
        default:
          System.out.println("Estado de error");
      }
    }
  }
