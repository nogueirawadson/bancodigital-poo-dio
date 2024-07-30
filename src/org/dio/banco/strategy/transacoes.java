package org.dio.banco.strategy;

//Classe para implementaçao dos métodos -

import org.dio.banco.cliente.Conta;
import org.dio.banco.cliente.DadosConta;

public class transacoes implements transacoesEstrategy{
    @Override
    public Conta transferir(double valor, DadosConta pagador, DadosConta recepitor) {
        pagador.setSaldo(pagador.getSaldo() - valor); // Subtraindo Valor para transferência
        recepitor.setSaldo(recepitor.getSaldo() + valor); //  Recebendo valor
        return null;
    }

    @Override
    public Conta sacar(double valor, DadosConta conta) {
        conta.setSaldo(conta.getSaldo() - valor);
        return null;
    }

    @Override
    public Conta depositar(double valor, DadosConta conta) {
        conta.setSaldo(conta.getSaldo() + valor);
        return null;

    }

    @Override
    public Conta pix(double valor, DadosConta pagador, DadosConta recepitor) {
        pagador.setSaldo(pagador.getSaldo() - valor);
        recepitor.setSaldo(recepitor.getSaldo() + valor);
        return null;
    }


    /**  public Conta transferir(double valor, DadosConta pagador, DadosConta recepitor) {
        pagador.setSaldo(pagador.getSaldo() - valor); // Subtraindo Valor para transferência
        recepitor.setSaldo(recepitor.getSaldo() + valor); //  Recebendo valor

        return null;
    }


    public Conta sacar(double valor, DadosConta conta) {
        conta.setSaldo(conta.getSaldo() - valor);


        return null;
    }

    @Override
    public Conta depositar(double valor, DadosConta conta) {
        conta.setSaldo(conta.getSaldo() + valor);
        return null;
    }

    public Conta  pix(double valor, DadosConta pagador, DadosConta recepitor) {
        pagador.setSaldo(pagador.getSaldo() - valor);
        recepitor.setSaldo(recepitor.getSaldo() + valor);

    return null;
    }
**/


}
