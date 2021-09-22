package questao03;

public abstract class CondimentDecorator extends Pizza {
    private Pizza decoratedPizza;

    public CondimentDecorator(Pizza pz) {
        this.decoratedPizza = pz;
    }

    public Pizza getDecoratedPizza() {
        return decoratedPizza;
    }

    public abstract double cost();
}
