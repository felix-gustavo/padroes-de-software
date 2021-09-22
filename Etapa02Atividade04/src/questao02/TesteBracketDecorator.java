package questao02;

public class TesteBracketDecorator {
    public static void main(String[] args) {
        Bracket b = new CurlyBracketDecorator(
                    new SquareBracketDecorator(
                    new RoundBracketDecorator(
                    new NumeroUm())));

        b.imprime();
    }
}
