public abstract class LocalidadeAbstractFactory {
    public abstract Data getData(int dia, int mes, int ano);
    public abstract Moeda getMoeda(double valor);
}