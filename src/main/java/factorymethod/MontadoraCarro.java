package factorymethod;

public class MontadoraCarro implements Montadora {

    public String comprar() {
        return "Compra efetivada";
    }

    public String cancelar() {
        return "Compra cancelada";
    }
}
