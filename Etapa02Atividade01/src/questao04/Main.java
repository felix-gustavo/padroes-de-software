package questao04;

import questao04.factory.ImpostoDeRendaFactory;
import questao04.model.imposto.ETipoImposto;
import questao04.model.imposto.ImpostoDeRenda;

public class Main {
    public static void main(String[] args) {
        ImpostoDeRenda imposto = ImpostoDeRendaFactory.newImpostoDeRenda(ETipoImposto.COMPLETO);
        imposto.calcula();
    }
}
