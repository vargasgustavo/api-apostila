package cap03;
import java.util.List;
public class MetodosComRetorno {
    public static String gerar() {
        String senha = "";
        for (int i = 1; i <= 8; i++) {
            senha += (int) (Math.random() * 10);
        }
        return senha;
    }
    public static int[] gerarArray(int numero) {
        int[] inteiro = new int[numero];
        for (int i = 0; i < inteiro.length; i++) {
            inteiro[i] = (int) (Math.random() * 1000);
        }
        return inteiro;
    }
    public static int getDia(String data) {
        try{
            int r = Integer.parseInt(data.substring(0, 2));
            return r;
        }
        catch(NumberFormatException | StringIndexOutOfBoundsException e){
            return 0;
        }
    }
    public static float calcularMedia(List<Float> notas) {
        int soma = 0;
        for (Float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    public static int somar(int numero[]) {
        int soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }
        return soma;
    }
}

