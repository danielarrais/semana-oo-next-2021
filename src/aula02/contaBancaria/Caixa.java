package aula02.contaBancaria;

import java.util.ArrayList;

public class Caixa {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();

        for (int i = 0; i <contas.size(); i++) {
            Conta contaItau = new Conta("888686-7", "005774", 5000000.00);
            contaItau.debitarSaldo(500.0);
        }



        Conta contaItau = new Conta("888686-7", "005774", 5000000.00);
        contaItau.debitarSaldo(500000.0);
        contaItau.debitarSaldo(100.0);
        contaItau.debitarSaldo(2000000.0);
        contaItau.debitarSaldo(2000090.0);


        debitarSaldoDeConta(50000.0, 600.0);

        // System.out.println(contaItau.getSaldo());
        // System.out.println(contaItau.getTransacoes().size());

        // System.out.println("===================================");

        // for (int i = 0; i < contaItau.getTransacoes().size(); i++) {
        //     Transacao transacao = contaItau.getTransacoes().get(i);
        //     System.out.println("VALOR: " + transacao.getValor() + " - AÇÃO: " + transacao.getTipo());
        // }
    }

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public static Double debitarSaldoDeConta(Double saldoAtual, Double saque) {
        return saldoAtual - saque;
    }

}
