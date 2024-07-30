package org.dio.banco.cliente;

import org.dio.banco.bancodeContas.ContasList;
import org.dio.banco.strategy.transacoesEstrategy;

import java.util.ArrayList;
import java.util.List;

public class Conta extends DadosConta implements transacoesEstrategy {



    public Conta transferir(double valor, DadosConta pagador, DadosConta recepitor) {
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



}