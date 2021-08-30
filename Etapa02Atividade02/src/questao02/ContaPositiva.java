package questao02;

class ContaPositiva implements EstadoDaConta {
    public void saca(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);

        if (conta.getSaldo() < 0)
            conta.setEstado(new ContaNegativa());
    }

    public void deposita(Conta conta, double valor) {
        if(valor > 0)
            conta.setSaldo(conta.getSaldo() + (valor * 0.98));
    }

    @Override
    public String toString() {
        return "POSITIVA";
    }
}
