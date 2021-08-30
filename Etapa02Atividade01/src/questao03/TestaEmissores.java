package questao03;

public class TestaEmissores {

    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();
        
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia("Mensagem 1");
        
        Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.envia("Mensagem 2");
        
        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.envia("Mensagem 3");
    }
}