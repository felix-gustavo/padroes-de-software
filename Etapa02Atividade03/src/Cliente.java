public class Cliente {
    public static void main(String[] args) {
        LocalidadeFactory factory = new LocalidadeFactory();
        LocalidadeAbstractFactory localidade = factory.newLocalidade();

        System.out.println(localidade.getData());
        System.out.println(localidade.getMoeda());
    }
}
