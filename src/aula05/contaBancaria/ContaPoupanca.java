package aula05.contaBancaria;

import java.util.Date;

public class ContaPoupanca extends Conta {
    // Construtores
    // modificador de acesso - NomeDaClasse - parametros
    public ContaPoupanca(String numero, String agencia, Double saldo) { // Construtor 1
        super(numero, agencia, saldo);
    }

    public void atualizarSaldoComRendimento(Double rendimento) {
        if(rendimento != null && rendimento > 0) {
            Double valorRendido = super.getSaldo() * (rendimento/100);
            Double novoSaldo = super.getSaldo() * (1 + (rendimento/100));

            super.setSaldo(novoSaldo);

            Transacao transacao = new Transacao(valorRendido, Transacao.POUPANCA);
            getTransacoes().add(transacao);
        }
    }

    @Override
    protected boolean podeSacar(Double saque) {
        return super.getSaldo() != null && super.getSaldo() > 0 && super.getSaldo() >= saque;
    }

}
