import java.util.Scanner;

public class Cliente {


    private String nomeCliente;



    public  Cliente( String nomeCliente) {
        this.nomeCliente = nomeCliente;

    }


    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return " | Titular:  " + nomeCliente + '\'';
    }

}

