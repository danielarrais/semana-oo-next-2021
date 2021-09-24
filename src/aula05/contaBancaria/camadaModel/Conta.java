package aula05.contaBancaria.camadaModel;

import java.util.ArrayList;

import aula05.contaBancaria.exceptions.FalhaTransacaoException;
import aula05.contaBancaria.exceptions.SaldoInsuficienteParaSaqueException;

// modificador de acesso - class - NomeDaClasse
public abstract class Conta {

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

    public void creditarSaldo(Double valor) throws FalhaTransacaoException {
        if(saldo != null) {
            saldo += valor;
            registrarTransacao(valor, Transacao.CREDITO);
        } else {
            System.out.println("Valor inválido!!!");
        }
    }

    public abstract boolean podeSacar(Double saque);


    public Double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public ArrayList<Transacao> getTransacoes() {
        return this.transacoes;
    }

    public void setSaldo(Double saldo) {
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
