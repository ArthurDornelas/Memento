package test;

import org.junit.jupiter.api.Test;
import padrao.memento.*;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    @Test
    void deveArmazenarEstado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoAnalisandoCredito.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
