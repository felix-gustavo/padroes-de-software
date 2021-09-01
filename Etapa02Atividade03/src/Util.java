import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {
    Properties getProp() throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        Properties props = new Properties();
        InputStream file = new FileInputStream(rootPath + "propriedades/localidade.properties");
        props.load(file);
        return props;
    }
}
