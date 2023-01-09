package cap03;
public class MetodosSemRetorno {
    public static void main(String[] args) {
        imprimir();
        imprimirTexto("Ola");
        somar(10, 20);
        mostrarSexoPorExtenso('F');
    }
    public static void imprimir() {
        System.out.println("Aprendendo a Linguagem Java");
    }
    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }
    public static void somar(int a, int b) {
        System.out.println(a + b);
    }
    public static void mostrarSexoPorExtenso(char sexo) {
        if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'M') {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo desconhecido");
        }
    }
}

