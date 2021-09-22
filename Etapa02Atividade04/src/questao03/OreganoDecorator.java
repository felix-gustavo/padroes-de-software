package questao03;

public class OreganoDecorator extends CondimentDecorator {
    public OreganoDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public double cost() {
        return 0.5 + this.getDecoratedPizza().cost();
    }

    @Override
    public String getDescription() {
        return "Oregano";
    }
}
