import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        List<Conta> contas = new ArrayList<>();





        conta1.Conta(new Cliente("Wadson"), new DadosConta("Poupança", 1233, "0009"),  200.0);
        conta2.Conta(new Cliente("Nogueira"), new DadosConta("Corrente", 33221, "0009"), 00.0);
        contas.add(conta1);
        contas.add(conta2);



        conta2.transferir(200, conta1, conta2);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());


        //contas.stream().filter(conta ->  conta1.getCliente().getNomeCliente().equals("Wadson"));
        //.forEach(System.out::println);

        contas.forEach(conta -> {
            String nomeCliente = conta.getCliente().getNomeCliente();
            if (nomeCliente.equals("Wadson")) {
                System.out.println(nomeCliente);
            }
        });

    }


    }