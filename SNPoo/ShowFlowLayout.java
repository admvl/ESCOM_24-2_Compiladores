import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ShowFlowLayout extends JFrame {
  public ShowFlowLayout() {
    // Poner el FlowLayout, alineado a la izquierda con un intervalo horizontal de 10
    // y un intervalo vertical de 20 entre componentes
    setLayout( new FlowLayout(FlowLayout.LEFT, 20, 20) );
    // Agregar etiquetas y texto en el frame
    add(new JLabel("Nombre"));
    add(new JTextField(8));
    add(new JLabel("Apellido"));
    add(new JTextField(8));
    add(new JLabel("Boleta"));
    add(new JTextField(8));
    add(new JLabel("Calificación"));
    add(new JTextField(4));
  }

  public static void main(String[] args) {
    ShowFlowLayout frame = new ShowFlowLayout();
    JButton boton = new JButton("Iniciar");
    
    frame.add(boton);
    frame.setTitle("Lista de estudiantes");
    frame.setSize(600, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
