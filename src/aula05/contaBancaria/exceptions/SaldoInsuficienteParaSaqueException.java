package aula05.contaBancaria.exceptions;

public class SaldoInsuficienteParaSaqueException extends Exception {
    public SaldoInsuficienteParaSaqueException(String mensagem) {
        super(mensagem);
    }
    
    public SaldoInsuficienteParaSaqueException() {
        super("Não há saldo suficiente!!!");
    }
}
