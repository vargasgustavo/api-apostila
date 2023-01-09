package cap02;
import javax.swing.JOptionPane;
public class Dado {
    public static void main(String[] args) {
        int numero = 0, jog1 = 0, jog2=0;
        String jogadas1 = "Jogador 1: ";
        for(int i = 1; i <= 5; i++){
            numero = 1 + (int)(Math.random()*6);
            jog1 += numero;
            jogadas1 += numero + " ";
        }
        String jogadas2 = "----------------------------\nJogador 2: ";
        for(int i = 1; i <= 5; i++){
            numero = 1 + (int)(Math.random()*6);
            jog2 += numero;
            jogadas2 += numero + " ";
        }
        JOptionPane.showMessageDialog(null, jogadas1 + "\nTotal 1 = "
                + jog1 + "\n" + jogadas2 + "\nTotal 2 = " + jog2);
    }
}

