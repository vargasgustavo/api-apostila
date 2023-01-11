package cap04;
public class UsaPincel {
    public static void main(String[] args) {
        Pincel pincel1 = new Pincel();
        pincel1.abrir();
        pincel1.cor = "azul";
        pincel1.comprimento = 100;
        pincel1.preco = 3.89;
        pincel1.mostrar();
        Pincel pincel2 = new Pincel();
        pincel2.cor = "verde";
        pincel2.mostrar();
        System.out.println(pincel2);
        System.out.println(pincel1);
    }
}

