package questao04.factory;

import questao04.model.imposto.ETipoImposto;
import questao04.model.imposto.ImpostoCompleto;
import questao04.model.imposto.ImpostoDeRenda;
import questao04.model.imposto.ImpostoSimplificado;

public abstract class ImpostoDeRendaFactory {
    public static ImpostoDeRenda newImpostoDeRenda(ETipoImposto tipo){
        if (tipo == ETipoImposto.SIMPLIFICADO){
            return new ImpostoSimplificado();
        } else if (tipo == ETipoImposto.COMPLETO){
            return new ImpostoCompleto();
        }
        return null;
    }
}
