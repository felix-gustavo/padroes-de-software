package questao03;

public class Main {
    public static void main(String[] args) {
        Processo processo = new Processo();

        processo.getEstado().valida(processo);
        processo.getEstado().designa(processo);
        processo.getEstado().defere(processo);

        System.out.println(processo.getEstado());
    }
}
