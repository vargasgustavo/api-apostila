package cap02;
import javax.swing.*;
public class Semana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Forneça o dia da semana (1 a 7)"));
        String pt="", en="";
        if (dia == 1) {	pt = "domingo"; }
        else if (dia == 2) { pt = "segunda"; }
        else if (dia == 3) { pt = "terça"; }
        else if (dia == 4) { pt = "quarta"; }
        else if (dia == 5) { pt = "quinta"; }
        else if (dia == 6) { pt = "sexta"; }
        else if (dia == 7) { pt = "sábado"; }
        else { pt = "desconhecido!"; }
        switch(dia) {
            case 1: en = "sunday";break;
            case 2: en = "monday";break;
            case 3: en = "tuesday";break;
            case 4: en = "wednesday";break;
            case 5: en = "thursday";break;
            case 6: en = "friday";break;
            case 7: en = "saturday";break;
            default: en = "unknown";break;
        }
        JOptionPane.showMessageDialog(null, pt + " - " + en);
    }
}

