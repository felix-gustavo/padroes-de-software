package questao02;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println("Depositando...");
        conta.deposita(100);

        System.out.print("Estado da conta: ");
        System.out.println(conta.getEstado());

        System.out.println("Sacando...");
        conta.saca(200);

        System.out.print("Saldo: ");
        System.out.println(conta.getSaldo());

        System.out.print("Estado da conta: ");
        System.out.println(conta.getEstado());

        System.out.println("Sacando...");
        conta.saca(200);
    }
}
