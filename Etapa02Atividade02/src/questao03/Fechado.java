package questao03;

public class Fechado implements EstadoDoProcesso {
    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo FECHADO");
    }

    @Override
    public void designa(Processo processo) {
        throw new RuntimeException("Não é possível designar o processo FECHADO");
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo FECHADO");
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo FECHADO");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível deferir o processo FECHADO");
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo FECHADO");
    }

    @Override
    public void fecha(Processo processo) {
        throw new RuntimeException("Impossível! O processo está fechado!");
    }

    @Override
    public String toString() {
        return "FECHADO";
    }
}
