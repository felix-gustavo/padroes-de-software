package questao03;

public class EmRecurso implements EstadoDoProcesso {
    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo EM RECURSO");
    }

    @Override
    public void designa(Processo processo) {
        processo.setEstado(new EmAvaliacao());
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo EM RECURSO");
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo EM RECURSO");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível deferir o processo EM RECURSO");
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo EM RECURSO");
    }

    @Override
    public void fecha(Processo processo) {
        throw new RuntimeException("Não é possível fechar o processo EM RECURSO");
    }

    @Override
    public String toString() {
        return "EM RECURSO";
    }
}
