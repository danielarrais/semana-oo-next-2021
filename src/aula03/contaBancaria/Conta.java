package aula03.contaBancaria;

import java.util.ArrayList;
import java.util.Date;

// modificador de acesso - class - NomeDaClasse
public class Conta {

    // public static final String RENDIMENTO = "100";

    // Atributos (caracteristicas)
    // modificador de acesso - tipo do atributo - nomeDoPadrao
    // protected String numero;
    public String numero;
    public String agencia;
    private Double saldo;
    private ArrayList<Transacao> transacoes;

    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia) { // Construtor 1
        this(numero, agencia, 0.0);
    }

    // Construtores
    // modificador de acesso - NomeDaClasse - parametros
    public Conta(String numero, String agencia, Double saldo) { // Construtor 1
        this.numero = numero;
        this.agencia = agencia;
        this.transacoes = new ArrayList<Transacao>();
        setSaldo(saldo);
    }

    // Métodos (Ações)
    // modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(Double saque) {
        if (podeSacar(saque)) {
            saldo -= saque;
            Transacao transacao = new Transacao(saque, Transacao.DEBITO);
            transacoes.add(transacao);
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }
    }

    public void creditarSaldo(Double valor) {
        if(saldo != null) {
            saldo += valor;
            Transacao transacao = new Transacao(valor, Transacao.CREDITO);
            transacoes.add(transacao);
        } else {
            System.out.println("Valor inválido!!!");
        }
    }

    protected boolean podeSacar(Double saque) {
        return saldo != null && saldo > 0 && saldo >= saque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public ArrayList<Transacao> getTransacoes() {
        return this.transacoes;
    }

    protected void setSaldo(Double saldo) {
        if(saldo != null) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }



    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", agencia='" + agencia + "'" +
            ", saldo='" + getSaldo() + "'" +
            ", transacoes='" + getTransacoes() + "'" +
            "}";
    }

}
