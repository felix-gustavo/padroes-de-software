package questao03;

public class Gestacao implements EstadoDoProcesso {
    @Override
    public void valida(Processo processo) {
        processo.setEstado(new Criado());
    }

    @Override
    public void designa(Processo processo) {
        throw new RuntimeException("Não é possível designar o processo no estado de GESTAÇÃO");
    }

    @Override
    public void cancela(Processo processo) {
        throw new RuntimeException("Não é possível cancelar o processo no estado de GESTAÇÃO");
    }

    @Override
    public void indefere(Processo processo) {
        throw new RuntimeException("Não é possível indeferir o processo no estado de GESTAÇÃO");
    }

    @Override
    public void defere(Processo processo) {
        throw new RuntimeException("Não é possível deferir o processo no estado de GESTAÇÃO");
    }

    @Override
    public void recorre(Processo processo) {
        throw new RuntimeException("Não é possível recorrer o processo no estado de GESTAÇÃO");
    }

    @Override
    public void fecha(Processo processo) {
        throw new RuntimeException("Não é possível fechar o processo no estado de GESTAÇÃO");
    }

    @Override
    public String toString() {
        return "GESTAÇÃO";
    }
}
