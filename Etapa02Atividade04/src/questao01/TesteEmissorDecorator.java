package questao01;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        String mensagem = "teste";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        System.out.println("");

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        System.out.println("");

        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(
                                    new EmissorDecoratorComCompressao(
                                    new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);
    }
}
