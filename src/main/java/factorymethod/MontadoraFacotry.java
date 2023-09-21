package factorymethod;

public class MontadoraFacotry {

    public static Montadora comprarVeiculo(String montadora) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factorymethod.Montadora" + montadora);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Veiculo Inexistente");
        }
        if (!(objeto instanceof Montadora)) {
            throw new IllegalArgumentException("Veiculo inválido");
        }
        return (Montadora) objeto;
    }
}
