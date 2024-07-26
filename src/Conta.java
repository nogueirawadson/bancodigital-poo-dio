import java.util.ArrayList;
import java.util.List;

public class Conta  {

    private Cliente cliente;
    private DadosConta dadosConta;
    private double saldo;


public Conta(){

}
    public void Conta( Cliente cliente, DadosConta dadosConta, double saldo) {

        this.cliente = cliente;
        this.dadosConta = dadosConta;
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DadosConta getDadosConta() {
    return dadosConta;
    }
    public void setDadosConta(DadosConta dadosConta) {
    this.dadosConta = dadosConta;
    }
    public double getSaldo() {
    return saldo;
    }
    public void setSaldo(double saldo) {
    this.saldo = saldo;

    }
    public void transferir(double valor, Conta pagador, Conta recepitor) {

        pagador.setSaldo(pagador.getSaldo() - valor); // Subtraindo Valor para transferência

        recepitor.setSaldo(recepitor.getSaldo() + valor); //  Recebendo valor
        this.saldo += valor;



    }

    public void sacar(double valor) {

    if (this.saldo >= valor) {
            this.saldo -= valor;
        }

    }

    @Override
    public String toString() {
        return "Conta:  "+
        dadosConta +
                 cliente +
                " | Saldo: " +
                saldo+
                '|';
    }
}
    /** public static void main(String[] args) {


        Conta conta = new Conta();
        List<Conta> bancoDeContas = new ArrayList<>();

        conta.Conta("Poupança", 1233, 12322, new Cliente("Wadson"));
        System.out.println(conta);
        bancoDeContas.add(conta);

    } **/






