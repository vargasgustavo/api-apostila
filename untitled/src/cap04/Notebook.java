package cap04;
public class Notebook extends Computador{
    private int autonomiaBateria;
    public Notebook(String modelo, int ram, double preco, int autonomiaBateria) {
        super(modelo,ram,preco);
        this.autonomiaBateria = autonomiaBateria;
    }
    public void mostrar() {
        super.mostrar();
        System.out.println(autonomiaBateria);
    }
}

