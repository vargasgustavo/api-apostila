package cap04;
public class Computador {
    private String modelo;
    private int ram;
    private double preco;
    public Computador() {
    }
    public Computador(String modelo) {
        this.modelo = modelo;
    }
    public Computador(String modelo, int ram) {
        this.modelo = modelo;
        this.ram = ram;
    }
    public Computador(String modelo, int ram, double preco) {
        this.modelo = modelo;
        this.ram = ram;
        this.preco = preco;
    }
    public void mostrar() {
        System.out.println(modelo);
        System.out.println(ram);
        System.out.println(preco);
    }
}

