package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraCaminhaoTest {

    @Test
    void deveExecutarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Caminhao");
        assertEquals("Compra efetivada", compra.comprar());
    }

    @Test
    void deveCancelarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Caminhao");
        assertEquals("Compra cancelada", compra.cancelar());
    }

}