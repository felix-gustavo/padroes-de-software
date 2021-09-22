package questao02;

public abstract class BracketDecorator implements Bracket {
    private Bracket bracket;

    public BracketDecorator(Bracket bracket) {
        this.bracket = bracket;
    }

    public abstract void imprime();

    public Bracket getBracket() {
        return bracket;
    }
}
