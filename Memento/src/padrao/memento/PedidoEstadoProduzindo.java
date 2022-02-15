package padrao.memento;

public class PedidoEstadoProduzindo implements PedidoEstado{
    private PedidoEstadoProduzindo() {};
    private static PedidoEstadoProduzindo instance = new PedidoEstadoProduzindo();
    public static PedidoEstadoProduzindo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Produzindo";
    }
}
