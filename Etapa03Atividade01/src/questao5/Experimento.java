package questao5;

import java.util.List;
import java.util.ArrayList;

public class Experimento {
    private List<RoboAction> actions;

    public Experimento() {
        actions = new ArrayList<>();
    }

    public void executeTest() {
        actions.forEach(a -> a.execute());
    }

    public void addAction(RoboAction action) {
        actions.add(action);
    }
}