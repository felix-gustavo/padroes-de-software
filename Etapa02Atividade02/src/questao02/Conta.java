package questao02;

class Conta {
    private double saldo;
    private EstadoDaConta estado;

    public Conta() {
        estado = new ContaPositiva();
    }

    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public EstadoDaConta getEstado() {
        return estado;
    }

    public void setEstado(EstadoDaConta estado) {
        this.estado = estado;
    }
}