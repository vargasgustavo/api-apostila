package cap02;
import javax.swing.JOptionPane;
public class ManipulaString {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Forneça uma palavra de pelo menos 6 letras");
        System.out.println("Apostila: " + palavra);
        System.out.println("Quantidade de caracteres: " + palavra.length());
        System.out.println("Maiúsculas: " + palavra.toUpperCase());
        System.out.println("Minúsculas: " + palavra.toLowerCase());
        System.out.println("Primeira letra: " + palavra.charAt(0));
        System.out.println("Quarta letra: " + palavra.charAt(3));
        System.out.println("Quatro primeiras letras: " + palavra.substring(0, 4));
        System.out.println("A partir da letra de posição 4: " + palavra.substring(4));
        System.out.println("Letras da posição 1 a 5: " + palavra.substring(1, 5));
        System.out.println("Posição letra 's': " + palavra.indexOf("s"));
    }
}

