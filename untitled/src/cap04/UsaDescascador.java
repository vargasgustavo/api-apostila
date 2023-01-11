package cap04;
public class UsaDescascador {
    public static void main(String[] args) {
        Fruta f1 = new Melancia();
        f1.descascar(2);
        Fruta f2 = new Abacaxi();
        f2.descascar(5);
        Fruta f3 = new Laranja();
        f3.descascar(10);
    }
}

