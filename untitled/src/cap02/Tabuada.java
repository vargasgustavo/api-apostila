package cap02;
import javax.swing.JOptionPane;
public class Tabuada{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        String ex = "";
        for (int i = 1; i <= 10; i++) {
            ex += (numero + " x " + i + " = " + (numero * i) + " \n");
        }
        JOptionPane.showMessageDialog(null, ex);
    }
}

