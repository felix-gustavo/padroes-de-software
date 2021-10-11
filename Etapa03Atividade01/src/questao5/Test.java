package questao5;

import questao5.actions.*;

public class Test {
    public static void main(String[] args) {
        Experimento experimento = new Experimento();
        experimento.addAction(new CheckTemp());
        experimento.addAction(new IncreaseTemp());
        experimento.executeTest();
    }
}