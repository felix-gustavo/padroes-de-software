package questao03;

public class Processo {
    private EstadoDoProcesso estado;

    Processo() {
        this.estado = new Gestacao();
    }

    public EstadoDoProcesso getEstado() {
        return estado;
    }

    public void setEstado(EstadoDoProcesso estado) {
        this.estado = estado;
    }
}
