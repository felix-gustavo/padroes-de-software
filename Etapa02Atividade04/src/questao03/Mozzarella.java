package questao03;

public class Mozzarella extends Pizza {
    public Mozzarella() {
    }

    @Override
    public double cost() {
        return 11.9;
    }

    @Override
    public String getDescription() {
        return "Mozzarella " + super.getDescription();
    }
}
