package cap02;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Notas {
    public static void main(String[] args) {
        float[] notas = new float[5];
        float soma = 0, media;
        for (int i = 0; i < 5; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Forneça a nota " + (i + 1)));
            soma = soma + notas[i];
        }
        media = soma / 5;
        Arrays.sort(notas);
        System.out.print("Notas fornecidas: ");
        for (float f:notas) {
            System.out.print(f + ", ");
        }
        System.out.println("\nMédia: " + media);
    }
}

