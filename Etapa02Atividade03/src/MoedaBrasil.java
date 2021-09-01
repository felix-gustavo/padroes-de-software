public class MoedaBrasil extends Moeda {
    public MoedaBrasil(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return String.format("R$ %,.2f", super.valor);
    }
}
