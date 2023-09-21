package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraEmpilhadeiraTest {

    @Test
    void deveExecutarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Empilhadeira");
        assertEquals("Compra efetivada", compra.comprar());
    }

    @Test
    void deveCancelarCompra() {
        Montadora compra = MontadoraFacotry.comprarVeiculo("Empilhadeira");
        assertEquals("Compra cancelada", compra.cancelar());
    }

}