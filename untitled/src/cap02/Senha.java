package cap02;
import javax.swing.JOptionPane;
public class Senha {
    public static void main(String[] args) {
        String senha = "";
        for (int i = 1; i <= 10; i++) {
            senha += (int) (Math.random() * 10);
        }
        JOptionPane.showMessageDialog(null, "Senha: " + senha);
    }
}

