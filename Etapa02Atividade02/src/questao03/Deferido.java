package questao03;

public class Deferido implements EstadoDoProcesso {

    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo DEFERIDO");
    }

    @Override
    public void designa(Processo processo) {
        throw new RuntimeException("Não é possível designar o processo DEFERIDO");
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo DEFERIDO");
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo DEFERIDO");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível deferir o processo DEFERIDO");
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo DEFERIDO");
    }

    @Override
    public void fecha(Processo processo) {
        processo.setEstado(new Fechado());
    }

    @Override
    public String toString() {
        return "DEFERIDO";
    }
}
