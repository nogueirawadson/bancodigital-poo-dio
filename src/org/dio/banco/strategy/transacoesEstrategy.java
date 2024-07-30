package org.dio.banco.strategy;


import org.dio.banco.cliente.Conta;
import org.dio.banco.cliente.DadosConta;

public interface  transacoesEstrategy {


    Conta transferir(double valor, DadosConta pagador, DadosConta recepitor);


    Conta sacar(double valor, DadosConta conta);

    Conta depositar(double valor, DadosConta conta);


   Conta  pix(double valor, DadosConta pagador, DadosConta recepitor);



}

