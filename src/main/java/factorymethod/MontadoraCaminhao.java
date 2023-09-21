package factorymethod;

public class MontadoraCaminhao implements Montadora {

    public String comprar() {
        return "Compra efetivada";
    }

    public String cancelar() {
        return "Compra cancelada";
    }
}
