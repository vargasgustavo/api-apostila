package cap04;

public class Pincel {
    String cor;
    int comprimento;
    double preco;
    public void abrir() {
        System.out.println("Abrindo a tampa do pincel");
    }
    public void fechar() {
        System.out.println("Fechando a tampa do pincel");
    }
    public void escrever() {
        System.out.println("Escrevendo com pincel");
    }
    public void mostrar() {
        System.out.println("["+cor+","+comprimento+","+preco+"]");
    }
    public String toString() {
        return cor+";"+comprimento+";"+preco;
    }
}

