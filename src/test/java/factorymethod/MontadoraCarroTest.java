package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraCarroTest {

    @Test
    void deveExecutarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Carro");
        assertEquals("Compra efetivada", compra.comprar());
    }

    @Test
    void deveCancelarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Carro");
        assertEquals("Compra cancelada", compra.cancelar());
    }

}