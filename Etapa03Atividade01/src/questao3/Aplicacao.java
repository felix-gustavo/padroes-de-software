package questao3;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Logger log1 = Logger.getInstance();
        log1.setAtivo(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");

        Logger log2 = Logger.getInstance();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }
}
