package questao03;

public class TomatoDecorator extends CondimentDecorator {
    public TomatoDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public double cost() {
        return 0.1 + this.getDecoratedPizza().cost();
    }

    @Override
    public String getDescription() {
        return "Tomato" + ", " + this.getDecoratedPizza().getDescription();
    }
}
