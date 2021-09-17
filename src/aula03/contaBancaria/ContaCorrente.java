package aula03.contaBancaria;

public class ContaCorrente extends Conta {

    private Double limite; // cheque especial

    public ContaCorrente(String numero, String agencia, Double limite, Double saldo) {
        super(numero, agencia, saldo);
        this.limite = limite;
    }

    @Override
    protected boolean podeSacar(Double saque) {
        return super.getSaldo() != null && saque <= (super.getSaldo() + limite);
    }
}
