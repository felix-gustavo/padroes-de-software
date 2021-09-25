package questao03;

public class CreamCheeseEdgeDecorator extends CondimentDecorator {
    public CreamCheeseEdgeDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public double cost() {
        return 1.2 + this.getDecoratedPizza().cost();
    }

    @Override
    public String getDescription() {
        return this.getDecoratedPizza().getDescription() + ", CreamCheeseEdge";
    }
}
