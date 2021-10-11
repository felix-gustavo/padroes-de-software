package questao6;

public class Comprovante extends Document {

    public Comprovante(Formatacao estilo, String mensagem) {
        super(estilo, mensagem);
    }

    @Override
    public String toString() {
        return "COMPROVANTE\n" + this.formatar();
    }
}