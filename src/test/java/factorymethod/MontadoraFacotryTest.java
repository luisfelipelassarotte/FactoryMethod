package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraFacotryTest {

    @Test
    void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            Montadora montadora = MontadoraFacotry.comprarVeiculo("Maquina do tempo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo Inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaVeiculoInvalido() {
        try {
            Montadora montadora = MontadoraFacotry.comprarVeiculo("Aviao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veiculo inválido", e.getMessage());
        }
    }

}