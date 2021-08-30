package questao03;

public class Criado implements EstadoDoProcesso {
    @Override
    public void valida(Processo processo) {
        throw new RuntimeException("Não é possível validar o processo CRIADO");
    }

    @Override
    public void designa(Processo processo) {
        processo.setEstado(new EmAvaliacao());
    }

    @Override
    public void cancela(Processo processo) {
        processo.setEstado(new Fechado());
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo CRIADO");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo CRIADO");
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo CRIADO");
    }

    @Override
    public void fecha(Processo processo) {
        throw new RuntimeException("Não é possível fechar o processo CRIADO");
    }

    @Override
    public String toString() {
        return "CRIADO";
    }
}
