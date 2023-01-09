package cap02;
import javax.swing.JOptionPane;
public class LoginSenha{
    public static void main(String[] args) {
        int cont = 0;
        final String loginOriginal = "login";
        final String senhaOriginal = "senha";
        while (cont < 3) {
            String login = JOptionPane.showInputDialog("Forneça um login");
            String senha = JOptionPane.showInputDialog("Forneça a senha");
            if (login.equals(loginOriginal) && senha.equals(senhaOriginal)) {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
                break;
            } else {
                cont++;
                if(cont==3){
                    JOptionPane.showMessageDialog(null, "Número de tentativas esgotadas!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\n"+
                            "Você tem mais "+(3-cont)+" tentativa(s)!");
                }
            }
        }
    }
}

