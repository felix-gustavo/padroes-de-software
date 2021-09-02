import java.io.IOException;
import java.util.Properties;

public class LocalidadeFactory {
    public LocalidadeAbstractFactory newLocalidade() throws IOException {
        Properties prop = new Util().getProp();
        String pais = prop.getProperty("pais");

        if (pais.equals("BR"))
            return new LocalidadeBrasil();

        return new LocalidadeEUA();
    }
}