package cap02;
import javax.swing.JOptionPane;
public class Meses {
    public static void main(String[] args) {
        String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun",
                "jul", "ago", "set", "out", "nov", "dez"};
        int numMes = (int) (Math.random() * 12);
        JOptionPane.showMessageDialog(null, "Mês : " + meses[numMes]);
    }
}

