package questao02;

public class CurlyBracketDecorator extends BracketDecorator {
    public CurlyBracketDecorator(Bracket bracket) {
        super(bracket);
    }

    @Override
    public void imprime() {
        System.out.print("{");
        this.getBracket().imprime();
        System.out.print("}");
    }
}
