package questao02;

class ContaNegativa implements EstadoDaConta {
      public void saca(Conta conta, double valor) {
        throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
      }

      public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.95));
        if(conta.getSaldo() > 0)
            conta.setEstado(new ContaPositiva());
      }

        @Override
        public String toString() {
            return "NEGATIVA";
        }
    }