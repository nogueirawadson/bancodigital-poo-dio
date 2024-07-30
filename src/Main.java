import org.dio.banco.bancodeContas.ContasList;
import org.dio.banco.cliente.Conta;
import org.dio.banco.cliente.DadosConta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        ContasList lista = new ContasList();

        Scanner sc = new Scanner(System.in);
       Conta d1 = new Conta();
       Conta d2 = new Conta();
       Conta d3 = new Conta();



       d1.Conta("Wadson", "Corrente", 1232, "2222", 800);

       d2.Conta("Nogueira", "Corrente", 1232, "2233", 800);

       lista.getContas().add(d1);
       lista.getContas().add(d2);

       d1.transferir(200, d1, d2);
        System.out.println("Saldo conta d1: Transferência " + d1.getSaldo());
       d1.sacar(200, d1);
        System.out.println("Saldo conta d1: Saque " + d1.getSaldo());
       d1.depositar(300, d1);
       System.out.println("Saldo conta d1: Deposito " + d1.getSaldo());

        System.out.println("Saldo conta d2: Transferência recebida " + d2.getSaldo());
        System.out.println(lista);
        System.out.println(
                lista.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(Double::sum)
        );








        //contas.stream().filter(conta ->  conta1.getCliente().getNomeCliente().equals("Wadson"));
        //.forEach(System.out::println);

        /**contas.forEach(conta -> {
            String nomeCliente = conta.getCliente().getNomeCliente();
            if (nomeCliente.equals("Wadson")) {
                System.out.println(nomeCliente);
            }
        });

**/    }


    }