package aula05.contaBancaria.exceptions;

public class ContaJaExisteException extends Exception {
    private String numeroConta;

    public ContaJaExisteException(String numeroConta) {
        super("A conta de número " + numeroConta + " já existe");
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }
}
