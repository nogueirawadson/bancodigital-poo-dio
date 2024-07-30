package org.dio.banco.bancodeContas;

import org.dio.banco.cliente.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContasList {

    List<Conta> contas = new ArrayList<Conta>();
    public ContasList() {
    }
    public void ContasList(List<Conta> contas) {
        this.contas = contas;
        contas.addAll(this.contas);
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "|| LISTA DE CONTAS || " +
                " Contas -> " + contas +
                '}';
    }
}
