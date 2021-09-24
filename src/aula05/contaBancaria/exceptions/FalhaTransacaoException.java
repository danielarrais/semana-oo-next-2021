package aula05.contaBancaria.exceptions;

public class FalhaTransacaoException extends Exception {
    private String tipoTransacao;

    public FalhaTransacaoException(String tipoTransacao) {
        super("Falha ao registrar a transação de " + tipoTransacao);
        this.tipoTransacao = tipoTransacao;
    }

    public String getTipoTransacao() {
        return this.tipoTransacao;
    }
}
