public class DadosConta {
    private String conta;
    private int numero;
  //  private double saldo;
    private String agencia;

    
    public DadosConta(String conta, int numero, String agencia) {
        this.conta = conta;
        this.numero = numero;
       // this.saldo = saldo;
        this.agencia = agencia;

    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    @Override
    public String toString() {
        return
                  conta + '\'' +
                " | numero: " + numero +
                " | agencia: '" + agencia + '\'' +
                '-';
    }
}
