public class LocalidadeFactory {
    public LocalidadeAbstractFactory newLocalidade() {
//      Verificar do arquivo de propriedades
        if (1 == 2)
            return new LocalidadeBrasil();
        else
            return new LocalidadeEUA();
    }
}
