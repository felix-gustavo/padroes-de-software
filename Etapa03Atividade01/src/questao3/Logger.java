package questao3;

public class Logger {
    private boolean ativo = false;
    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s) {
        if (this.ativo) {
            System.out.println("LOG:: " + s);
        }
    }
}