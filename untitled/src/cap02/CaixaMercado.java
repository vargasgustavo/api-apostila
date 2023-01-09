package cap02;
import javax.swing.JOptionPane;
public class CaixaMercado {
    public static void main(String[] args) {
        double total = 0;
        while(true) {
            String preco = JOptionPane.showInputDialog("Preço do produto?");
            if (preco == null) {
                break;
            }
            total += Double.parseDouble(preco);
        }
        JOptionPane.showMessageDialog(null, "Total da compra: "+ total);
    }
}

