package excecao;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Erro: saldo insuficiente para realizar o saque."
            );
        }

        saldo -= valor;

        System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo atual: R$ " + saldo);
    }
}