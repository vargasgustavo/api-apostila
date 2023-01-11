package cap04;
public class Produto {
    private int codigo;
    public double preco;
    private String tipo;
    public String descricao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("novo") || tipo.equalsIgnoreCase("usado")) {
            this.tipo = tipo;
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    public void mostrar() {
        System.out.println("["+codigo+","+tipo+","+preco+","+descricao+"]");
    }
}
