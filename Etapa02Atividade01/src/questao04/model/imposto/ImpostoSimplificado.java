package questao04.model.imposto;

import questao04.model.metodo.MetodoCalculo;
import questao04.model.metodo.MetodoSimplificado;

public class ImpostoSimplificado extends ImpostoDeRenda {
    @Override
    protected MetodoCalculo getMetodoCalculo() {
        return new MetodoSimplificado();
    }
}
