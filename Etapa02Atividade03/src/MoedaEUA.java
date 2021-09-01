import java.text.DecimalFormat;

public class MoedaEUA extends Moeda {
    public MoedaEUA(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return String.format("$ %.2f", super.valor);
    }
}
