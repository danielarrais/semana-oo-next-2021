package aula02.contaBancaria;

public class Caixa {
    public static void main(String[] args) {
        Conta contaItau = new Conta("888686-7", "005774", 5000000.00);
        contaItau.debitarSaldo(500000.0);
        contaItau.debitarSaldo(100.0);

        System.out.println(contaItau.getSaldo());
        System.out.println(contaItau.getTransacoes().size());
    }
}
