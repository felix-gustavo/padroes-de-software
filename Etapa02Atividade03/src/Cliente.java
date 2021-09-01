import java.io.IOException;

public class Cliente {
    public static void main(String[] args) throws IOException {
        LocalidadeFactory factory = new LocalidadeFactory();
        LocalidadeAbstractFactory localidade = factory.newLocalidade();

        System.out.println(localidade.getData(1, 10, 2021));
        System.out.println(localidade.getMoeda(100));
    }
}
