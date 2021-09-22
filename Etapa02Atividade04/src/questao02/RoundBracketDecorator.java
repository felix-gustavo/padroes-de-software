package questao02;

public class RoundBracketDecorator extends BracketDecorator {
    public RoundBracketDecorator(Bracket bracket) {
        super(bracket);
    }

    @Override
    public void imprime() {
        System.out.print("(");
        this.getBracket().imprime();
        System.out.print(")");
    }
}
