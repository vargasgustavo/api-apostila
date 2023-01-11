package cap04;
public class Casa {
    public Quarto quarto1, quarto2;
    public Sala sala;
    public Casa() {
        quarto1 = new Quarto();
        quarto2 = new Quarto();
        sala = new Sala();
    }
}

