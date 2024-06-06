public class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private double precoProduto;

    public Compra(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "\nNome do produto = " + nomeProduto +
                "\nPreço = R$" + precoProduto;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.precoProduto).compareTo(Double.valueOf(outraCompra.precoProduto));
    }
}
