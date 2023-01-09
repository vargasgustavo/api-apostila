package cap02;
import javax.swing.JOptionPane;
public class CalculaMedia {
    public static void main(String[] args) {
        String aux1, aux2, aux3;
        float p1, p2, tr, media;
        try {
            aux1 = JOptionPane.showInputDialog("Nota da prova 1?");
            p1 = Float.parseFloat(aux1);
            aux2 = JOptionPane.showInputDialog("Nota da prova 2?");
            p2 = Float.parseFloat(aux2);
            aux3 = JOptionPane.showInputDialog("Nota do trabalho?");
            tr = Float.parseFloat(aux3);
            media = (p1 + p2 + tr) / 3;
            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "Média: " + media + "\nAprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Média: " + media + "\nReprovado");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conversão, forneça uma nota válida " + erro);
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Tecla Cancel pressionada");
        }
    }
}

