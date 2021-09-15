package aula02.contaBancaria;

import java.util.Date;

// Representação de uma transação (saque, depósito...)
public class Transacao {
    public static final String DEBITO = "DEBITO";
    public static final String CREDITO = "CREDITO";

    private Double valor;
    private Date data;
    private String tipo;

    public Transacao(Double valor, String tipo) {
        this.valor = valor;
        this.data = new Date();
        this.tipo = tipo;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
