import javax.swing.*;
public class MiFrameConComponentes {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Proceso a iniciar");

    // Agregar un botón al frame
    JButton boton = new JButton("Iniciar");
    frame.add(boton);
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Centrar el frame
    frame.setVisible(true);
  }
}
