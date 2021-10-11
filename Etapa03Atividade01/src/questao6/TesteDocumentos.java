package questao6;

public class TesteDocumentos {
    public static void main(String[] args) {        
        Document doc = new Comprovante(new Padrao(), "teste");
        System.out.println(doc);
    }
}