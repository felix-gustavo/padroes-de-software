package questao03;

public class Pepperoni extends Pizza {
    public Pepperoni() {
    }

    @Override
    public double cost() {
        return 14.9;
    }

    @Override
    public String getDescription() {
        return "Pepperoni " + super.getDescription();
    }
}
