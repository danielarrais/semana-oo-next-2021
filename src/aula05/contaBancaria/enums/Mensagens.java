package aula05.contaBancaria.enums;

public enum Mensagens {
    MENSAGEM_SALDO_INSUFICIENTE("Não há saldo suficiente!!!");

    private String mensagem;

    private Mensagens(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
