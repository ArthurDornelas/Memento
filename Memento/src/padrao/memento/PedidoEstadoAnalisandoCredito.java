package padrao.memento;

public class PedidoEstadoAnalisandoCredito implements PedidoEstado{
    private PedidoEstadoAnalisandoCredito() {};
    private static PedidoEstadoAnalisandoCredito instance = new PedidoEstadoAnalisandoCredito();
    public static PedidoEstadoAnalisandoCredito getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Analisando Crédito";
    }
}
