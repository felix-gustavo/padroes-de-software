package questao03;

public class Pizzaiolo {
    public static void main(String[] args) {
        Pizza pizza = new TomatoDecorator(new Mozzarella());
        System.out.println(pizza.getDescription());
    }
}
