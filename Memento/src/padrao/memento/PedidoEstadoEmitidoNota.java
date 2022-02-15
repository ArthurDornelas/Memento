package padrao.memento;

public class PedidoEstadoEmitidoNota implements PedidoEstado{
    private PedidoEstadoEmitidoNota() {};
    private static PedidoEstadoEmitidoNota instance = new PedidoEstadoEmitidoNota();
    public static PedidoEstadoEmitidoNota getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Emitido Nota";
    }
}
