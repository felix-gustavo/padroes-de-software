package questao03;

public class Indeferido implements EstadoDoProcesso {

    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo no estado de INDEFERIDO");
    }

    @Override
    public void designa(Processo processo) {
        throw new RuntimeException("Não é possível designar o processo no estado de INDEFERIDO");
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo no estado de INDEFERIDO");
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Impossível! O processo está indeferido!");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível deferir o processo no estado de INDEFERIDO");
    }

    @Override
    public void recorre(Processo processo) {
        processo.setEstado(new EmRecurso());
    }

    @Override
    public void fecha(Processo processo) {
        processo.setEstado(new Fechado());
    }

    @Override
    public String toString() {
        return "INDEFERIDO";
    }
}
