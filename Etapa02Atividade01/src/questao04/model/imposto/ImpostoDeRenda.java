package questao04.model.imposto;

import questao04.model.metodo.MetodoCalculo;

public abstract class ImpostoDeRenda {
    public void calcula() {
        MetodoCalculo metodoCalculo = getMetodoCalculo();
        metodoCalculo.calcula();
    }
    protected abstract MetodoCalculo getMetodoCalculo();
}
