package questao03;

public interface EstadoDoProcesso {
    void valida (Processo processo);
    void designa (Processo processo);
    void cancela (Processo processo);
    void indefere (Processo processo);
    void defere(Processo processo);
    void recorre (Processo processo);
    void fecha (Processo processo);
}
