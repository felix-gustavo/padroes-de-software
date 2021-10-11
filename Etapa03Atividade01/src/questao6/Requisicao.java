package questao6;

public class Requisicao extends Document {

    public Requisicao(Formatacao estilo, String mensagem) {
        super(estilo, mensagem);
    }

    @Override
    public String toString() {
        return "REQUISIÇÃO\n" + super.formatar();
    }

    
}