package questao03;

public class EmissorEmail implements Emissor {
    public void envia(String mensagem){
        System.out.println("Enviando por email a mensagem: ");
        System.out.println(mensagem);
    }
}