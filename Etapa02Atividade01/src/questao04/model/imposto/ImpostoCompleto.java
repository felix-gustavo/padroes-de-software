package questao04.model.imposto;

import questao04.model.metodo.MetodoCalculo;
import questao04.model.metodo.MetodoCompleto;

public class ImpostoCompleto extends ImpostoDeRenda {
    @Override
    protected MetodoCalculo getMetodoCalculo() {
        return new MetodoCompleto();
    }
}
