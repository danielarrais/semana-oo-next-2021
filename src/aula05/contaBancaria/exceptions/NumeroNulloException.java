package aula05.contaBancaria.exceptions;

public class NumeroNulloException extends RuntimeException {
    public NumeroNulloException(String message, Throwable cause) {
        super(message, cause);
    }
}
