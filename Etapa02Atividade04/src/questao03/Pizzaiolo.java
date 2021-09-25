package questao03;

public class Pizzaiolo {
    public static void main(String[] args) {
//        Pizza pizza = new CreamCheeseEdgeDecorator(new TomatoDecorator(new Mozzarella()));
        Pizza pizza = new TomatoDecorator(new BaconDecorator(new OreganoDecorator(new Pepperoni())));
        System.out.println(pizza.getDescription() + " --- " + pizza.cost());
    }
}
