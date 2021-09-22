package questao02;

public class SquareBracketDecorator extends BracketDecorator {
    public SquareBracketDecorator(Bracket bracket) {
        super(bracket);
    }

    @Override
    public void imprime() {
        System.out.print("[");
        this.getBracket().imprime();
        System.out.print("]");
    }
}
