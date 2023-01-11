package cap04;
public class UsaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.descricao = "veículo";
        p1.setTipo("exportação");
        p1.setPreco(-2);
        p1.mostrar();

        Produto p2 = new Produto();
        p1.setCodigo(2);
        p1.descricao = "computador";
        p1.setTipo("novo");
        p1.setPreco(5000);
        p1.mostrar();
    }
}

