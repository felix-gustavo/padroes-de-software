public class LocalidadeEUA extends LocalidadeAbstractFactory {
    @Override
    public Data getData(int dia, int mes, int ano) {
        return new DataEUA(dia, mes, ano);
    }

    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaEUA(valor);
    }
}
