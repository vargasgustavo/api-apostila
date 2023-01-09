package cap03;
public class Contagem {
    public static void contar() {
        System.out.println("Numeros de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void contar(int fim) {
        System.out.println("Numeros com fim determinado:");
        for (int i = 1; i <= fim; i++) {
            System.out.println(i);
        }
    }
    public static void contar(int inicio, int fim) {
        System.out.println("Numeros com inicio e fim determinados:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
    public static void contar(int inicio, int fim, int pausa) {
        System.out.println("Numeros com inicio, fim e pausa determinados:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000 * pausa);
            }
            catch (InterruptedException erro) {
            }
        }
    }
}

