package questao4;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SomadorAdapter implements SomadorEsperado {
    SomadorExistente se = new SomadorExistente();

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = Arrays.stream(vetor).boxed().collect(Collectors.toList());
        return se.somaLista(lista);
    }
    
}
