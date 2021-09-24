package aula05.contaBancaria.exceptions;

import aula05.contaBancaria.enums.Mensagens;

public class SaldoInsuficienteParaSaqueException extends Exception {
    private Double saldoAtual;

    public SaldoInsuficienteParaSaqueException(String mensagem, Double saldoAtual) {
        super(mensagem);
        this.saldoAtual = saldoAtual;
    }
    
    public SaldoInsuficienteParaSaqueException(Double saldoAtual) {
        super(Mensagens.MENSAGEM_SALDO_INSUFICIENTE.getMensagem());
        this.saldoAtual = saldoAtual;
    }

    public Double getSaldoAtual() {
        return this.saldoAtual;
    }
}
