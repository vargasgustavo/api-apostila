package cap04;
public class Automovel implements Motor{
    public void ligar() {
        System.out.println("Ligando o automóvel");
    }
    public void desligar() {
        System.out.println("Desligando o automóvel");
    }
    public void acelerar(int v) {
        System.out.println("Acelerando o automóvel");
    }
    public void frear() {
        System.out.println("Freando o automóvel");
    }
}

