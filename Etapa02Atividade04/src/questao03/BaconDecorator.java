package questao03;

public class BaconDecorator extends CondimentDecorator {
    public BaconDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public double cost() {
        return 0.8 + this.getDecoratedPizza().cost();
    }

    @Override
    public String getDescription() {
        return "Bacon";
    }
}
