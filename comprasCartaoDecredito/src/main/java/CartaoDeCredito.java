import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldoDisponivel;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldoDisponivel = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if(this.saldoDisponivel > compra.getPrecoProduto()) {
            this.saldoDisponivel -= compra.getPrecoProduto();
            this.compras.add(compra);
            return true;
        }
        else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
