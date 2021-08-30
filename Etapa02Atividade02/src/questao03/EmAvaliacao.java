package questao03;

public class EmAvaliacao implements EstadoDoProcesso {
    private void avisaInteressado() {
        System.out.println("Notificando interessados...");
    }

    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo EM AVALIAÇÃO");
    }

    @Override
    public void designa(Processo processo) {
        throw new RuntimeException("Não é possível designar o processo EM AVALIAÇÃO");
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo EM AVALIAÇÃO");
    }

    @Override
    public void indefere(Processo processo) {
        processo.setEstado(new Indeferido());
        this.avisaInteressado();
    }

    @Override
    public void defere(Processo processo) {
        processo.setEstado(new Deferido());
        this.avisaInteressado();
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo EM AVALIAÇÃO");
    }

    @Override
    public void fecha(Processo processo) {
        throw new RuntimeException("Não é possível fechar o processo EM AVALIAÇÃO");
    }

    @Override
    public String toString() {
        return "EM AVALIAÇÃO";
    }
}
