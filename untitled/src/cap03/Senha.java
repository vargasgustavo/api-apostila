package cap03;
public class Senha {
    public static String gerar() {
        String senha = "";
        for (int i = 1; i <= 8; i++) {
            senha += (int) (Math.random() * 10);
        }
        return senha;
    }
}

