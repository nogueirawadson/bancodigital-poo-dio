package org.dio.banco.cliente;


public class DadosConta  {
    private String nomeCliente;
    private String TipoContaBancaria;
    private int agencia;
    private String numeroConta;
    private double saldo;



    public void Conta(  String nomeCliente, String TipoContaBancaria, int agencia, String numeroConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.TipoContaBancaria = TipoContaBancaria;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;


    }


    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoContaBancaria() {
        return TipoContaBancaria;
    }

    public void setTipoContaBancaria(String tipoContaBancaria) {
        TipoContaBancaria = tipoContaBancaria;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return " **** " +
                " Cliente |" +
                " nomeCliente: " + nomeCliente  +
                " - TipoContaBancaria: " + TipoContaBancaria +
                " - agencia: " + agencia +
                " - numeroConta: " + numeroConta  +
                " - saldo : " + saldo +
                '|';
    }


}
