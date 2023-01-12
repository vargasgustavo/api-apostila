package cap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaMetodosComRetorno {
    public static void main(String[] args) {
        System.out.println(MetodosComRetorno.gerar());
        System.out.println(Arrays.toString(MetodosComRetorno.gerarArray(5)));
        System.out.println(MetodosComRetorno.getDia("24-06-2001"));
        List<Float> notas = new ArrayList<Float>();
        notas.add(5.8f);
        notas.add(5.2f);
        notas.add(7.1f);
        System.out.println(MetodosComRetorno.calcularMedia(notas));
        int[] numeros = {5,9,7,65};
        System.out.println(MetodosComRetorno.somar(numeros));
    }
}

